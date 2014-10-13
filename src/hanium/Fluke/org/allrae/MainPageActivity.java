package hanium.Fluke.org.allrae;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainPageActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_page);
	
        Button Btn1=(Button)findViewById(R.id.Btn1) ;
        Btn1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
				Intent myIntent=new Intent(getApplicationContext(),Image1Activity.class);
				startActivity(myIntent);
			}
					
        });         		
	
	}


}