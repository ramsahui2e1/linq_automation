package databse;

import java.io.IOException;
import java.util.HashMap;

import com.google.gson.Gson;

import models.GetListing;
import okhttp3.*;
import staticData.Cookies;
import staticData.GlobleData;

public class ApiRequest {
   private final static OkHttpClient httpClient = new OkHttpClient();
   public static GetListing getListing(int linqId,String mobile) {
	   String url=String.format("%s/api/LinqApi/GetListing?listingId=%d&editable=false&utm_source=&utm_medium=&utm_campaign=&mobile=%s&appId=%s",GlobleData.getServer(),linqId,mobile,Cookies.getAppId());
       HashMap<String,String> headers= new HashMap<String,String>();
       headers.put("Authorization","Authorization "+ Cookies.getAuthorization());
    //   headers.put("Content-Type","application/json; charset=utf-8");
       Headers headerbuild = Headers.of(headers);
	   Request request = new Request.Builder()
    		             .url(url)
    		             .headers(headerbuild)
    		             .build();
       try {
    	   ResponseBody  response = httpClient.newCall(request).execute().body();
    		Gson gson = new Gson();
    		String json=response.string().toString();
    		System.out.println(json);
    		GetListing f=gson.fromJson(json,GetListing.class);
    		return f;
       }
       catch(IOException ex) {
         ex.printStackTrace(); 
       }
	   return null;
   }
}
