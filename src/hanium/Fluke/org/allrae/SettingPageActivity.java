package hanium.Fluke.org.allrae;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class SettingPageActivity extends Activity implements OnClickListener {

	Button user, alarm, notify, version, logout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting_page);

		findViewById(R.id.user_btn).setOnClickListener(this);
		findViewById(R.id.notify_btn).setOnClickListener(this);
		findViewById(R.id.version_btn).setOnClickListener(this);
		findViewById(R.id.logout_btn).setOnClickListener(this);

		user = (Button) findViewById(R.id.user_btn);
		notify = (Button) findViewById(R.id.notify_btn);
		version = (Button) findViewById(R.id.version_btn);
		logout = (Button) findViewById(R.id.logout_btn);

		ImageButton backButton = (ImageButton) findViewById(R.id.back_btn);
		backButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				finish();
			}

		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {
		case R.id.user_btn:
			Intent myIntent = new Intent(getApplicationContext(),
					SettingUserPageActivity.class);
			startActivity(myIntent);
			break;
		case R.id.notify_btn:
			Intent myIntent_1 = new Intent(getApplicationContext(),
					NoticePageActivity.class);
			startActivity(myIntent_1);
			break;
		case R.id.version_btn:
			Intent myIntent_2 = new Intent(getApplicationContext(),
					VersionPageActivity.class);
			startActivity(myIntent_2);
			break;
		case R.id.logout_btn:
			Intent myIntent_3 = new Intent(getApplicationContext(),
					LogoutPageActivity.class);
			startActivity(myIntent_3);
			break;

		default:
			break;
		}

	}

}
