package com.sc.wrapper;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

public class Calendar extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        try {
           	 	if ("beep".equals(action)) {
           			String message = args.getString(0);                   	    		
               		callbackContext.success(message+" Babu");
                	return true;
                }
            	callbackContext.error("Invalid action");
            	return false;
        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
            callbackContext.error(e.getMessage());
            return false;
        } 
    }
}