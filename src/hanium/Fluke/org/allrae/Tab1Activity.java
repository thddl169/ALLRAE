package hanium.Fluke.org.allrae;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class Tab1Activity extends TabActivity {
	
	private TabHost host;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab1);
		
		host = getTabHost();
		TabHost.TabSpec tabs;
		
		tabs = host.newTabSpec("tag1");
		tabs.setIndicator("Main");
		Intent one = new Intent(getApplicationContext(), MainPageActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		tabs.setContent(one);
		host.addTab(tabs); 
		
		tabs = host.newTabSpec("tab2");
		tabs.setIndicator("Writing");
		Intent two = new Intent(getApplicationContext(),WriteListActivity.class);
		tabs.setContent(two);
		host.addTab(tabs);
		
		tabs = host.newTabSpec("tab3");
		tabs.setIndicator("Search");
		Intent three = new Intent(getApplicationContext(),SearchByAreaActivity.class);
		tabs.setContent(three);
		host.addTab(tabs);
		
		
		tabs = host.newTabSpec("tab4");
		tabs.setIndicator("My");
		Intent four= new Intent(getApplicationContext(),MyPageActivity.class);
		tabs.setContent(four);
		host.addTab(tabs);
	}

	
}
