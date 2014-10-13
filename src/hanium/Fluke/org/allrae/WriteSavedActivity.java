package hanium.Fluke.org.allrae;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WriteSavedActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_write_saved);
		
		Button button_write_continue = (Button) findViewById(R.id.button_write_continue);
		button_write_continue.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						WriteCategoryActivity.class);
				startActivity(myIntent);
			}

		});
		
		Button button_write_edit = (Button) findViewById(R.id.button_write_edit);
		button_write_edit.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						WriteCategortEditActivity.class);
				startActivity(myIntent);
			}

		});
		
		Button button_write_complete = (Button) findViewById(R.id.button_write_complete);
		button_write_complete.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						ThumbNailActivity.class);
				startActivity(myIntent);
			}

		});
		
		Button button_write_hold = (Button) findViewById(R.id.button_write_hold);
		button_write_hold.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent=new Intent(getApplicationContext(),WriteListActivity.class);
				myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//이거 쓰면 이전거 다 지워지면서 새 창 띄움.
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