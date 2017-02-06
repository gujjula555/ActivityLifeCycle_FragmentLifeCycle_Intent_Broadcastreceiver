package com.example.android.colors.broadcastreceiver.broadcastboot.broadcastdemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.colors.broadcastreceiver.R;


/*
 * This app is using the launch mode of singleTop, so long as it is
 * the top process and new one will not be launched, instead it will get a new
 * intent via NewItent(), which is what I want for the demo of
 * some of the system broadcast via the receiver.
 */


public class MainActivity extends AppCompatActivity {

	MainFragment mFragment=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		int info = 1;
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			info = extras.getInt("mStatus",1);
		}
		mFragment = new MainFragment(info);
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, mFragment).commit();
		}
	}
	
	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		int info = 1;
		Bundle extras = intent.getExtras();
		if (extras != null) {
			info = extras.getInt("mStatus",1);
		}
		mFragment.setstat(info);
	}


}
