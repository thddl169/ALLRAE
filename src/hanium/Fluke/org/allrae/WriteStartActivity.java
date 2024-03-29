package hanium.Fluke.org.allrae;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

public class WriteStartActivity extends ActionBarActivity {

	private Button dateBtn;
	private TextView dateTxt;
	int mYear, mMonth, mDay;
	static final int DATE_DIALOG_ID = 1;

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

		Spinner spineer1 = (Spinner) findViewById(R.id.mySpinner1);
		ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,
				R.array.area, android.R.layout.simple_spinner_item);
		adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spineer1.setAdapter(adapter1);

		dateTxt = (TextView) findViewById(R.id.date_txt);
		dateBtn = (Button) findViewById(R.id.date_btn);

		dateBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(DATE_DIALOG_ID);

			}
		});

		final Calendar c = Calendar.getInstance();
		mYear = c.get(Calendar.YEAR);
		mMonth = c.get(Calendar.MONTH);
		mDay = c.get(Calendar.DATE);

		updateDate();
	}

	private void updateDate() {
		String str = mYear + "년 " + (mMonth + 1) + "월 " + mDay + "일 ";
		dateTxt.setText(str);
	}

	private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {

			mYear = year;
			mMonth = monthOfYear;
			mDay = dayOfMonth;
			updateDate();
		}
	};

	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DATE_DIALOG_ID:

			return new DatePickerDialog(this, mDateSetListener, mYear, mMonth,
					mDay);

		}

		return null;

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