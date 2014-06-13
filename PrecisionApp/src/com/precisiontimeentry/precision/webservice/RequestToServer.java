/** 
 * Created by abrysov at Mar 10, 2012
 */
package com.precisiontimeentry.precision.webservice;

/**
 * @author abrysov
 * 
 */
public class RequestToServer {

	private final String sLoginURL = "http://precisiontimeentry.com/api/login.php";
	// private final String sLocateURL =
	// "http://hitapp.nl/api/boogaart/locate.php";
	// private final String sBestekURL =
	// "http://hitapp.nl/api/boogaart/bestek.php";
	// private final String sCrowURL = "http://hitapp.nl/api/boogaart/crow.php";
	// private final String sControleURL =
	// "http://hitapp.nl/api/boogaart/controle.php";
	// private final String sHelpURL = "http://hitapp.nl/api/boogaart/help.php";
	// private final String sDeelgebiedURL =
	// "http://hitapp.nl/api/boogaart/deelgebied.php";
	// private final String sAddressURL =
	// "http://hitapp.nl/api/boogaart/adres.php";
	// private final String sStatusURL =
	// "http://hitapp.nl/api/boogaart/status.php";
	// private final String sPlanningURL =
	// "http://hitapp.nl/api/boogaart/planning.php";
	// private final String sCatlistURL =
	// "http://hitapp.nl/api/boogaart/catlist.php";

	// private final String sPostURL = "http://havenapp.nl/api/post.php";

	public static final String KEY = "8etamer7thufrat2as4a";
	private String requestBody = null;

	/**
	 * Login API Constructor for a login request.
	 */
	// public RequestToServer(String gebied) {
	// String[] xyilo = gebied.split(" ");
	// requestBody = sCatlistURL;
	// requestBody += "?";
	// requestBody += "key=";
	// requestBody += KEY;
	// requestBody += "&";
	// requestBody += "gebied=";
	// requestBody += xyilo[0];
	// }

	public RequestToServer(String sLogin, String sPassword) {
		requestBody = sLoginURL;
		requestBody += "?";
		requestBody += "u=";
		requestBody += sLogin;
		requestBody += "&";
		requestBody += "p=";
		requestBody += sPassword;
	}

	/**
	 * Locate API Constructor for a GPS request.
	 */
	// public RequestToServer (Double _dLatitude, Double _dLogitude ) {
	// requestBody = sLocateURL;
	// requestBody += "?";
	// requestBody += "key=";
	// requestBody += KEY;
	// requestBody += "&";
	// requestBody += "lat=";
	//
	// if (_dLatitude != null){
	// requestBody += _dLatitude.toString();
	// }else{
	// requestBody += "0.0";
	// }
	//
	// requestBody += "&";
	// requestBody += "long=";
	//
	// if (_dLogitude != null) {
	// requestBody += _dLogitude.toString();
	// }else{
	// requestBody += "";
	// }
	// }
	// /**
	// * Besteck API
	// * Constructor for a subregion(deelgebied) request.
	// */
	// public RequestToServer (RequestAPIType _type, String _sDeelgebied) {
	// //?key=8ie4lusplayoe67uties&deelgebied=DEELGEBIED
	// requestBody = sBestekURL;
	// requestBody += "?";
	// requestBody += "key=";
	// requestBody += KEY;
	// requestBody += "&";
	// requestBody += "deelgebied=";
	// requestBody += _sDeelgebied;
	// }
	// /**
	// * Crow API
	// * @param _type
	// * @param _deelgebied
	// * @param _bestek
	// */
	// public RequestToServer (RequestAPIType _type, String _deelgebied, String
	// _bestek) {
	//
	// requestBody = sCrowURL;
	// requestBody += "?";
	// requestBody += "key=";
	// requestBody += KEY;
	// requestBody += "&deelgebied=";
	// requestBody += _deelgebied;
	// requestBody += "&bestek=";
	// requestBody += _bestek;
	// }
	// /**
	// * Status API
	// * @param _identifier
	// * @param _type
	// */
	// public RequestToServer (String _identifier, RequestAPIType _type){
	//
	// requestBody = sStatusURL;
	// requestBody += "?";
	// requestBody += "key=";
	// requestBody += KEY;
	// requestBody += "&identifier=";
	// requestBody += _identifier;
	// }
	//
	// public RequestToServer (String _identifier, RequestAPIType _type, int
	// year, int week){
	// requestBody = "";
	// if (_type == RequestAPIType.PLANNING){
	// requestBody = sPlanningURL;
	// } else {
	// requestBody = sStatusURL;
	// }
	// requestBody += "?";
	// requestBody += "key=";
	// requestBody += KEY;
	// requestBody += "&identifier=";
	// requestBody += _identifier;
	// requestBody += "&year=";
	// requestBody += year;
	// requestBody += "&week=";
	// requestBody += week;
	// }
	// /**
	// * Control API
	// * @param _identifier
	// * @param _deelgebied
	// * @param _type
	// */
	// public RequestToServer (String _identifier, String _deelgebied,
	// RequestAPIType _type, String _catid){
	// // http://hitapp.nl/api/boogaart/status.php?key=8etamer7thufrat2as4a
	// // &identifier=IDENTIFIER
	// // &deelgebied=AREACODE
	// // &catid=CATEGORYID
	//
	// requestBody = sControleURL;
	// requestBody += "?";
	// requestBody += "key=";
	// requestBody += KEY;
	// requestBody += "&identifier=";
	// requestBody += _identifier;
	// requestBody += "&deelgebied=";
	// requestBody += _deelgebied;
	// requestBody += "&catid=";
	// requestBody += _catid;
	//
	// // requestBody = sControleURL;
	// // requestBody += "?";
	// // requestBody += "key=";
	// // requestBody += KEY;
	// // requestBody += "&identifier=";
	// // requestBody += _identifier;
	// // requestBody += "&deelgebied=";
	// // requestBody += _deelgebied;
	// }
	//
	// // public RequestToServer (RequestAPIType _type , String _lat, String
	// _long, String _){
	// //
	// // requestBody = sPostURL;
	// // requestBody += "?";
	// // requestBody += "key=";
	// // requestBody += KEY;
	// // requestBody += "&=";
	// // requestBody += _identifier;
	// // requestBody += "&deelgebied=";
	// // requestBody += _deelgebied;
	// //
	// // }
	//
	// /**
	// * Help Api
	// * DEELGEBIED API
	// * ADDRESSES API
	// * @param type
	// */
	// public RequestToServer (RequestAPIType type) {
	//
	// switch (type) {
	// case HELP:
	//
	// requestBody = sHelpURL;
	// requestBody += "?";
	// requestBody += "key=";
	// requestBody += KEY;
	//
	// break;
	//
	// case DEELGEBIED:
	//
	// requestBody = sDeelgebiedURL;
	// requestBody += "?";
	// requestBody += "key=";
	// requestBody += KEY;
	//
	// break;
	//
	// case ADDRESSES:
	//
	// requestBody = sAddressURL;
	// requestBody += "?";
	// requestBody += "key=";
	// requestBody += KEY;
	//
	// break;
	//
	// default:
	// break;
	// }
	//
	// }

	public String getREQUEST() {

		return requestBody;
	}

	// private String md5(String _in) {
	// MessageDigest digest;
	// try {
	// digest = MessageDigest.getInstance("MD5");
	// digest.reset();
	// digest.update(_in.getBytes());
	// byte[] a = digest.digest();
	// int len = a.length;
	// StringBuilder sb = new StringBuilder(len << 1);
	// for (int i = 0; i < len; i++) {
	// sb.append(Character.forDigit((a[i] & 0xf0) >> 4, 16));
	// sb.append(Character.forDigit(a[i] & 0x0f, 16));
	// }
	// return sb.toString();
	// } catch (NoSuchAlgorithmException e) {
	// e.printStackTrace();
	// }
	// return null;
	// }

}
