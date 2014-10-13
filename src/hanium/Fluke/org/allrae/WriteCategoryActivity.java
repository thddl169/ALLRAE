package hanium.Fluke.org.allrae;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WriteCategoryActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_write_category);
		Button button_previous = (Button) findViewById(R.id.button_previous);
		button_previous.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				finish();
			}

		});
		
		Button button_write_place = (Button) findViewById(R.id.button_write_place);
		button_write_place.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						WritePlaceActivity.class);
				startActivity(myIntent);
			}

		});
		
		Button button_write_restaurant = (Button) findViewById(R.id.button_write_restaurant);
		button_write_restaurant.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						WriteRestaurantActivity.class);
				startActivity(myIntent);
			}

		});
		
		Button button_write_home = (Button) findViewById(R.id.button_write_home);
		button_write_home.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						WriteLodingActivity.class);
				startActivity(myIntent);
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