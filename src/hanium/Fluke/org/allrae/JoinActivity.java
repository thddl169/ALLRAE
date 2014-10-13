package hanium.Fluke.org.allrae;

import library.DatabaseHandler;
import library.UserFunctions;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;

public class JoinActivity extends Activity {
	/*
	 * Button btnRegister; Button btnLinkToLogin; EditText inputFullName;
	 * EditText inputEmail; EditText inputPassword; TextView registerErrorMsg;
	 */

	ImageButton join_before;
	Button join_ok;
	EditText email_edit;
	EditText re_password_edit;
	RadioGroup sex_radio;
	EditText nickname;

	// JSON Response node names
	private static String KEY_SUCCESS = "success";
	private static String KEY_ERROR = "error";
	private static String KEY_ERROR_MSG = "error_msg";
	private static String KEY_ID = "uid";
	private static String KEY_EMAIL = "email";
	private static String KEY_SEX = "sex";
	private static String KEY_PHOTO = "photo";
	private static String KEY_NICK = "nick";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_join);

		// Importing all assets like buttons, text fields
		join_before = (ImageButton) findViewById(R.id.join_before);
		join_ok = (Button) findViewById(R.id.join_ok);
		email_edit = (EditText) findViewById(R.id.email_edit);
		re_password_edit = (EditText) findViewById(R.id.re_password_edit);
		sex_radio = (RadioGroup) findViewById(R.id.sex_group);
		nickname = (EditText) findViewById(R.id.nic_name_edit);

		// OK Button Click event
		join_ok.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String email = email_edit.getText().toString();
				String password = re_password_edit.getText().toString();
				String sex;
				if (sex_radio.getCheckedRadioButtonId() == R.id.sex_man)
					sex = "man";
				else
					sex = "woman";
				String nick = nickname.getText().toString();
				UserFunctions userFunction = new UserFunctions();
				JSONObject json = userFunction.registerUser(email, password,
						sex, nick);

				// check for login response
				try {
					if (json.getString(KEY_SUCCESS) != null) {
						// registerErrorMsg.setText("");
						String res = json.getString(KEY_SUCCESS);
						if (Integer.parseInt(res) == 1) {
							// user successfully registred
							// Store user details in SQLite Database
							DatabaseHandler db = new DatabaseHandler(
									getApplicationContext());
							JSONObject json_user = json.getJSONObject("mem");

							// Clear all previous data in database
							userFunction.logoutUser(getApplicationContext());
							db.insertUser(json_user.getString(KEY_ID),
									json_user.getString(KEY_EMAIL),
									json.getString(KEY_SEX),
									json.getString(KEY_PHOTO),
									json_user.getString(KEY_NICK));
							// Launch Login Screen
							Intent myIntent = new Intent(
									getApplicationContext(), LoginActivity.class);
							// Close all views before launching Login Screen
							myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
							startActivity(myIntent);
							// Close Registration Screen
							finish();
						} else {
							// Error in registration
							// registerErrorMsg.setText("Error occured in registration");
						}
					}
				} catch (JSONException e) {
					e.printStackTrace();
				}

			}

		});

		join_before.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						MainActivity.class);
				startActivity(myIntent);
			}

		});

	}

}
