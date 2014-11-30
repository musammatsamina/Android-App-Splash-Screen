package com.example.splashscreen;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SplashScreenActivity extends Activity {

	// Splash screen timer
	private static int SPLASH_TIME_OUT = 3000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// main layout
		RelativeLayout relativeLayout = new RelativeLayout(this);
		RelativeLayout.LayoutParams mainLayoutParams =  new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

		
		
		
		TextView tv = new TextView(this);
		tv.setText("Spash Screen Programitically");
		
		RelativeLayout.LayoutParams tvLayoutParams = 
				new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
		tvLayoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
		tv.setLayoutParams(tvLayoutParams);
		// add tv under main layout
		relativeLayout.addView(tv);
		
		
		
		// set the view
		setContentView(relativeLayout, mainLayoutParams);
		
		
		
		new Handler().postDelayed(new Runnable() {
			 
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
 
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(i);
 
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
		
		
		
		
		
	}
	
}
