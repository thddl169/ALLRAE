package hanium.Fluke.org.allrae;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SettingUserPageActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting_user_page);

		Button Notify_PW = (Button) findViewById(R.id.ok_btn);
		Notify_PW.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Toast.makeText(getApplicationContext(), "저장되었습니다.",
						Toast.LENGTH_SHORT).show();
				finish();
			}

		});

		ImageButton backButton = (ImageButton) findViewById(R.id.back_btn);
		backButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				finish();
			}

		});

		Button delete_Btn = (Button) findViewById(R.id.delete_btn);
		delete_Btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				AlertDialog dialog = createDialogBox();
				dialog.show();

			}
		});

	}

	private AlertDialog createDialogBox() {

		AlertDialog.Builder builder = new AlertDialog.Builder(this);

		builder.setTitle("안내");
		builder.setMessage("계정을 삭제하시겠습니까?");

		builder.setPositiveButton("예", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int whichButton) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(getApplicationContext(),
						MainActivity.class);
				startActivity(myIntent);
			}
		});

		builder.setNeutralButton("취소", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int whichButton) {
				// TODO Auto-generated method stub

				dialog.cancel();
			}
		});

		builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int whichButton) {
				// TODO Auto-generated method stub

				dialog.cancel();
			}
		});

		AlertDialog dialog = builder.create();

		return dialog;

	}

}
