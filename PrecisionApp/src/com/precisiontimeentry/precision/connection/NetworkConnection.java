package com.precisiontimeentry.precision.connection;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

public class NetworkConnection extends AsyncTask<Void, Void, String> {

	String url;
	Context context;
	ProxyInterface proxyInterface;
	private ProgressDialog progressDialog;

	public NetworkConnection(String url, Context context,
			ProxyInterface proxyInterface) {
		this.url = url;
		this.context = context;
		this.proxyInterface = proxyInterface;
	}

	@Override
	protected void onPostExecute(String result) {
		super.onPostExecute(result);
		System.out.println(result);
		proxyInterface.responseFromService(result);
		progressDialog.dismiss();
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		progressDialog = new ProgressDialog(context);
		progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
		//progressDialog.setMessage("Thank You For patience ...");
		progressDialog.show();
	}

	@Override
	protected String doInBackground(Void... params) {
		System.out.println(url);
		String response = new Proxy().getDetailFromUrl(url);
		return response;
	}

}
