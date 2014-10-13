package hanium.Fluke.org.allrae;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class FindingUserPageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_finding_user_page);

		ImageButton backButton = (ImageButton) findViewById(R.id.back_btn);
		backButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				finish();
			}

		});

	}

}
