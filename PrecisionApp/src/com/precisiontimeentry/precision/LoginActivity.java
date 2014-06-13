package com.precisiontimeentry.precision;

import org.json.JSONException;

import com.precisiontimeentry.precision.connection.NetworkUtil;
import com.precisiontimeentry.precision.model.LoginData;
import com.precisiontimeentry.precision.webservice.RequestToServer;
import com.precisiontimeentry.precision.webservice.SenderToJSONAPI;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity implements OnClickListener {

	private EditText username, password;
	private Button login, forgotPass;
	private ProgressDialog progressDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		Initialization();
	}

	private void Initialization() {

		username = (EditText) findViewById(R.id.txt_username);
		password = (EditText) findViewById(R.id.txt_password);
		login = (Button) findViewById(R.id.btn_login);
		forgotPass = (Button) findViewById(R.id.btn_forgot_password);

		login.setOnClickListener(this);
		forgotPass.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_login:

			if (NetworkUtil.getConnectivityStatus(getApplicationContext())) {
				LoginTask mLoginTask = new LoginTask();
				mLoginTask.execute();
			} else {
				Toast.makeText(LoginActivity.this, "No internet connection", Toast.LENGTH_SHORT).show();
			}

			break;
		case R.id.btn_forgot_password:

			break;

		default:
			break;
		}

	}
	private class LoginTask extends AsyncTask<Void, Void, Void> {

		RequestToServer rqts; 
		SenderToJSONAPI sjta;

		@Override
		protected void onPreExecute() {
			progressDialog = new ProgressDialog(LoginActivity.this);
			progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
			progressDialog.setCancelable(false);
			progressDialog.show();
			super.onPreExecute();
		}

		@Override
		protected Void doInBackground(Void... params) {

			String usernameText = username.getText().toString().trim();
			String passwordText = password.getText().toString().trim();

			rqts = new RequestToServer(usernameText, passwordText);
			sjta = new SenderToJSONAPI(rqts, 1001);

			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			progressDialog.dismiss();

			if (sjta.getJsObjResponse() != null) {
				try {
					if (sjta.getJsObjResponse().get("password") != null) {

						LoginData mLoginData = new LoginData();
						mLoginData.setId(sjta.getJsObjResponse().get("id").toString());
						mLoginData.setTk_id(sjta.getJsObjResponse().get("tk_id").toString());
						mLoginData.setRole(sjta.getJsObjResponse().get("role").toString());
						mLoginData.setUsername(sjta.getJsObjResponse().get("username").toString());
						mLoginData.setPassword(sjta.getJsObjResponse().get("password").toString());

						System.out.println("id = " + mLoginData.getId());
						System.out.println("id = " + mLoginData.getTk_id());
						System.out.println("id = " + mLoginData.getRole());
						System.out.println("id = " + mLoginData.getUsername());
						System.out.println("id = " + mLoginData.getPassword());

						Intent mIntent = new Intent(LoginActivity.this, HomeActivity.class);
						startActivity(mIntent);
						overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);

					}
				} catch (JSONException e) {
					Toast.makeText(LoginActivity.this, "Login Failed! Invalid login credentials, please try again", Toast.LENGTH_SHORT)
							.show();
					Log.e("", "Login Failed !");
				}

			}

			super.onPostExecute(result);

		}
	}

}
