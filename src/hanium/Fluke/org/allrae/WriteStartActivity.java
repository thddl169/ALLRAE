package hanium.Fluke.org.allrae;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WriteStartActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_write_start);
		Button button_next = (Button) findViewById(R.id.button_next);
		button_next.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						WriteCategoryActivity.class);
				startActivity(myIntent);
			}

		});
		
		Button button_previous = (Button) findViewById(R.id.button_previous);
		button_previous.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				finish();
			}

		});

	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}