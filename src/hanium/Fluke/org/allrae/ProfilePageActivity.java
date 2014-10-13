package hanium.Fluke.org.allrae;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;




public class ProfilePageActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile_page);

		Button ok_btn = (Button) findViewById(R.id.modify_ok);
		ok_btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "저장되었습니다.",
						Toast.LENGTH_SHORT).show();
				finish();
			}

		});

		ImageButton backButton = (ImageButton) findViewById(R.id.profile_before);
		backButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}

		});

	}

}