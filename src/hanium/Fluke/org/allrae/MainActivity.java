package hanium.Fluke.org.allrae;

import android.content.Intent;
import android.graphics.Paint.Join;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


	        Button login_button=(Button)findViewById(R.id.login_button) ;
	        login_button.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					
					Intent myIntent=new Intent(getApplicationContext(),LoginActivity.class);
					startActivity(myIntent);
				}
						
	        });
	        
	        Button join_button=(Button)findViewById(R.id.join_button) ;
	        join_button.setOnClickListener(new OnClickListener(){
				public void onClick(View v){
					
					Intent myIntent=new Intent(getApplicationContext(),JoinActivity.class);
					startActivity(myIntent);
				}
						
	        });
	   
	    
	    	}


	    /**
	     * A placeholder fragment containing a simple view.
	     */
	    public static class PlaceholderFragment extends Fragment {

	        public PlaceholderFragment() {
	        }

	       
	    }
	}

	
