package com.precisiontimeentry.precision;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PendingTabsActivity extends FragmentActivity implements OnClickListener {

	private Button RtoSButton, IncButton;
	FragmentManager mFragmentManager;
	FragmentTransaction mFragmentTransaction;
	Fragment mFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pending_entries_tabs);
		
		RtoSButton = (Button) findViewById(R.id.btn_rtos);
		IncButton = (Button) findViewById(R.id.btn_incmp);

		RtoSButton.setOnClickListener(this);
		IncButton.setOnClickListener(this);

		if (savedInstanceState == null) {
			mFragment = new PendingEntryRtoSFragment();
			mFragmentManager = getSupportFragmentManager();
			mFragmentTransaction = mFragmentManager.beginTransaction();
			mFragmentTransaction.replace(R.id.frame_container, mFragment);
			mFragmentTransaction.commit();
			
			
		}

	}

	@Override
	public void onClick(View v) {

		Fragment fragment = null;
		switch (v.getId()) {
		case R.id.btn_rtos:
			fragment = new PendingEntryRtoSFragment();
			break;
		case R.id.btn_incmp:
			fragment = new PendingEntryIncfragment();
			break;

		default:
			break;
		}
		if (fragment != null) {
			mFragmentManager = getSupportFragmentManager();
			mFragmentTransaction = mFragmentManager.beginTransaction();
			mFragmentTransaction.replace(R.id.frame_container, fragment);
			mFragmentTransaction.commit();
		}
	}

}