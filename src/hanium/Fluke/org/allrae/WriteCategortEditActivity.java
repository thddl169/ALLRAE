package hanium.Fluke.org.allrae;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WriteCategortEditActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_write_category_edit);
		
		Button button_end = (Button) findViewById(R.id.button_end);
		button_end.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						WriteListActivity.class);
				startActivity(myIntent);
			}

		});
		
		Button button_previous = (Button) findViewById(R.id.button_previous);
		button_previous.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						WriteSavedActivity.class);
				startActivity(myIntent);
			}

		});

	}

}
