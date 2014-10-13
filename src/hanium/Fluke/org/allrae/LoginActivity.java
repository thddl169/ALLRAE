package hanium.Fluke.org.allrae;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginActivity extends ActionBarActivity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       
        
        
        ImageButton login_before=(ImageButton)findViewById(R.id.login_before) ;
        login_before.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				finish();
			}
					
        }); 
        
        Button login_ok=(Button)findViewById(R.id.login_ok) ;
        login_ok.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
				Intent myIntent=new Intent(getApplicationContext(),Tab1Activity.class);
				myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//이거 쓰면 이전거 다 지워지면서 새 창 띄움.
				startActivity(myIntent);
			}
					
        });         		
      
    }

}
