package hanium.Fluke.org.allrae;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Spinner;
import android.widget.TextView;

public class WriteRestaurantActivity extends ImageSelectHelperActivity {

	private Button dateBtn;
	private TextView dateTxt;
	int mYear, mMonth, mDay;
	static final int DATE_DIALOG_ID = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_write_restaurant);

		Button button_next = (Button) findViewById(R.id.button_next);
		button_next.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getApplicationContext(),
						WriteMoveActivity.class);
				startActivity(myIntent);
			}

		});

		Button button_album = (Button) findViewById(R.id.button_album);
		button_album.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startSelectImage();
			}
		});

		getSelectedImageFile();

		final RatingBar ratingbar1 = (RatingBar) findViewById(R.id.ratingBar1);
		ratingbar1
				.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {

					@Override
					public void onRatingChanged(RatingBar ratingBar,
							float rating, boolean fromUser) {
						// TODO Auto-generated method stub

					}

				});

		final RatingBar ratingbar2 = (RatingBar) findViewById(R.id.ratingBar2);
		ratingbar2
				.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {

					@Override
					public void onRatingChanged(RatingBar ratingBar,
							float rating, boolean fromUser) {
						// TODO Auto-generated method stub

					}

				});

		final RatingBar ratingbar3 = (RatingBar) findViewById(R.id.ratingBar3);
		ratingbar3
				.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {

					@Override
					public void onRatingChanged(RatingBar ratingBar,
							float rating, boolean fromUser) {
						// TODO Auto-generated method stub

					}

				});

		Spinner spineer1 = (Spinner) findViewById(R.id.mySpinner1);
		ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,
				R.array.cost, android.R.layout.simple_spinner_item);
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