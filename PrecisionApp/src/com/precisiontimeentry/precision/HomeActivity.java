package com.precisiontimeentry.precision;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class HomeActivity extends Activity implements OnClickListener {

	private TextView newEntryBtn, pendingEntryBtn, historyBtn, StatsBtn, settingBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		intialization();

	}

	private void intialization() {

		newEntryBtn = (TextView) findViewById(R.id.btn_new_entry);
		pendingEntryBtn = (TextView) findViewById(R.id.btn_pending_entries);
		historyBtn = (TextView) findViewById(R.id.btn_history);
		StatsBtn = (TextView) findViewById(R.id.btn_new_time_stats);
		settingBtn = (TextView) findViewById(R.id.btn_settings);

		newEntryBtn.setOnClickListener(this);
		pendingEntryBtn.setOnClickListener(this);
		historyBtn.setOnClickListener(this);
		StatsBtn.setOnClickListener(this);
		settingBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		Intent mIntent = null;
		switch (v.getId()) {
		case R.id.btn_new_entry:
			mIntent = new Intent(HomeActivity.this, NewEntryActivity.class);

			break;
		case R.id.btn_pending_entries:
			mIntent = new Intent(HomeActivity.this, PendingTabsActivity.class);

			break;
		case R.id.btn_history:
			mIntent = new Intent(HomeActivity.this, HistoryTabsActivity.class);

			break;
		case R.id.btn_new_time_stats:
			mIntent = new Intent(HomeActivity.this, StatsActivity.class);

			break;
		case R.id.btn_settings:
			mIntent = new Intent(HomeActivity.this, SettingActivity.class);

			break;

		default:
			break;
		}

		if (mIntent != null) {
			startActivity(mIntent);
			overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
		}
	}

}
