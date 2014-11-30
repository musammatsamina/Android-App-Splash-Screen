package com.example.splashscreen;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		LinearLayout mainLinearLayout = new LinearLayout(this);
		mainLinearLayout.setBackgroundColor(Color.parseColor("#cdcdcd"));
		LinearLayout.LayoutParams linearLayoutParams = 
				new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
		
		
		TextView tv = new TextView(this);
		tv.setText("Main Activity Layout");
		
		RelativeLayout.LayoutParams tvLayoutParams = 
				new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		tv.setLayoutParams(tvLayoutParams);
		// add tv under main layout
		mainLinearLayout.addView(tv);
		
		
		
		// Set content view
		setContentView(mainLinearLayout, linearLayoutParams);
		
		
		
		// find the new one
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
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
