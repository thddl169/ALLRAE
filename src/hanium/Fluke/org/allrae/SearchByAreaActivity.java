package hanium.Fluke.org.allrae;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;




public class SearchByAreaActivity extends Activity {
	/**
	 * 페이지가 열려 있는지 알기 위한 플래그
	 */
	boolean isPageOpen = false;

	/**
	 * 애니메이션 객체
	 */
	Animation translateLeftAnim;
	Animation translateRightAnim;

	/**
	 * 슬라이딩으로 보여지는 페이지 레이아웃
	 */
	LinearLayout slidingPage01;
	
	/**
	 * 버튼
	 */
	Button openBtn01;

	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_by_area);
		
		Spinner spineer1 = (Spinner)findViewById(R.id.mySpinner1);
		ArrayAdapter adapter1 =ArrayAdapter.createFromResource(
				this,R.array.pay,android.R.layout.simple_spinner_item);
		adapter1.setDropDownViewResource(
				android.R.layout.simple_spinner_dropdown_item);
		spineer1.setAdapter(adapter1);
		

        // 슬라이딩으로 보여질 레이아웃 객체 참조
        slidingPage01 = (LinearLayout) findViewById(R.id.slidingPage01);

        // 애니메이션 객체 로딩
        translateLeftAnim = AnimationUtils.loadAnimation(this, R.anim.translate_left);
        translateRightAnim = AnimationUtils.loadAnimation(this, R.anim.translate_right);

        // 애니메이션 객체에 리스너 설정
        SlidingPageAnimationListener animListener = new SlidingPageAnimationListener();
        translateLeftAnim.setAnimationListener(animListener);
        translateRightAnim.setAnimationListener(animListener);



        openBtn01 = (Button) findViewById(R.id.openBtn01);
        openBtn01.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		// 애니메이션 적용
        		if (isPageOpen) {
        			slidingPage01.startAnimation(translateRightAnim);
        		} else {
        			slidingPage01.setVisibility(View.VISIBLE);
        			slidingPage01.startAnimation(translateLeftAnim);
        		}
        	}

			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
        });

    }
    

    private class SlidingPageAnimationListener implements AnimationListener {
    	/**
    	 * 애니메이션이 끝날 때 호출되는 메소드
    	 */
		public void onAnimationEnd(Animation animation) {
			if (isPageOpen) {
				slidingPage01.setVisibility(View.INVISIBLE);

				openBtn01.setText("Open");
				isPageOpen = false;
			} else {
				openBtn01.setText("Close");
				isPageOpen = true;
			}
		}

		public void onAnimationRepeat(Animation animation) {

		}

		public void onAnimationStart(Animation animation) {

		}

		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}


	
	
    }}
