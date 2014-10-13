package hanium.Fluke.org.allrae;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class VersionPageActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_version_page);
		Button nowVersion = (Button) findViewById(R.id.now_version);
		nowVersion.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Toast.makeText(getApplicationContext(), "���� ������ 0.0ver �Դϴ�.",
						Toast.LENGTH_SHORT).show();

			}
		});

		Button latestVersion = (Button) findViewById(R.id.latest_version);
		latestVersion.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Toast.makeText(getApplicationContext(), "�ֽ� ������ 0.0ver �Դϴ�.",
						Toast.LENGTH_SHORT).show();

			}
		});

		ImageButton backButton = (ImageButton) findViewById(R.id.back_btn);
		backButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				finish();
			}

		});

	}

}
