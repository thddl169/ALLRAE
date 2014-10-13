package hanium.Fluke.org.allrae;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MyPageActivity extends Activity implements OnClickListener {
	private LinearLayout comeBa, goBa, alarmBa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_page);

		findViewById(R.id.mypage_menu_come).setOnClickListener(this);
		findViewById(R.id.mypage_menu_go).setOnClickListener(this);
		findViewById(R.id.mypage_menu_alarm).setOnClickListener(this);

		comeBa = (LinearLayout) findViewById(R.id.mypage_menu_come_ba);
		goBa = (LinearLayout) findViewById(R.id.mypage_menu_go_ba);
		alarmBa = (LinearLayout) findViewById(R.id.mypage_menu_alarm_ba);

		Button modify_Button = (Button) findViewById(R.id.modify_btn);
		modify_Button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						ProfilePageActivity.class);
				startActivity(myIntent);
			}

		});

		ImageButton setButton = (ImageButton) findViewById(R.id.setting_btn);
		setButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				Intent myIntent = new Intent(getApplicationContext(),
						SettingPageActivity.class);
				startActivity(myIntent);

			}
		});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.mypage_menu_come:
			comeBa.setVisibility(View.VISIBLE);
			goBa.setVisibility(View.INVISIBLE);
			alarmBa.setVisibility(View.INVISIBLE);
			break;
		case R.id.mypage_menu_go:
			comeBa.setVisibility(View.INVISIBLE);
			goBa.setVisibility(View.VISIBLE);
			alarmBa.setVisibility(View.INVISIBLE);
			break;
		case R.id.mypage_menu_alarm:
			comeBa.setVisibility(View.INVISIBLE);
			goBa.setVisibility(View.INVISIBLE);
			alarmBa.setVisibility(View.VISIBLE);
			break;

		default:
			break;
		}

	}

}
