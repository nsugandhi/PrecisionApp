package com.precisiontimeentry.precision;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HistoryTabsActivity extends FragmentActivity implements OnClickListener {

	private Button daysButton, monthButton, matterButton;
	FragmentManager mFragmentManager;
	FragmentTransaction mFragmentTransaction;
	Fragment mFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_history_tabs);

		daysButton = (Button) findViewById(R.id.btn_days);
		monthButton = (Button) findViewById(R.id.btn_months);
		matterButton = (Button) findViewById(R.id.btn_matter);

		daysButton.setOnClickListener(this);
		monthButton.setOnClickListener(this);
		matterButton.setOnClickListener(this);

		if (savedInstanceState == null) {
			mFragment = new HistoryBydatefragment();
			mFragmentManager = getSupportFragmentManager();
			mFragmentTransaction = mFragmentManager.beginTransaction();
			mFragmentTransaction.replace(R.id.frame_container, mFragment);
			mFragmentTransaction.commit();
			changeTabBG(R.color.precision_one, R.color.precision_two, R.color.precision_two);
		}

	}

	@Override
	public void onClick(View v) {

		Fragment fragment = null;
		switch (v.getId()) {
		case R.id.btn_days:
			fragment = new HistoryBydatefragment();
			changeTabBG(R.color.precision_one, R.color.precision_two, R.color.precision_two);
			break;
		case R.id.btn_months:
			fragment = new HistoryBymonthfragment();
			changeTabBG(R.color.precision_two, R.color.precision_one, R.color.precision_two);
			break;
		case R.id.btn_matter:
			fragment = new HistoryBymatterfragment();
			changeTabBG(R.color.precision_two, R.color.precision_two, R.color.precision_one);
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

	private void changeTabBG(int v1, int v2, int v3) {

		daysButton.setTextColor(getResources().getColor(v1));
		monthButton.setTextColor(getResources().getColor(v2));
		matterButton.setTextColor(getResources().getColor(v3));

	}

}
