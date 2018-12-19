package cl.entel.plugins.digitalpersona;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import android.content.Context;

public class Digital extends CordovaPlugin {
    private static final String TAG = "DigitalPerson huellero";
    private byte[] byteArray;
    private CallbackContext callbackContext = null;
    
    //FIJO
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext newCallbackContext) {
        Log.i(TAG, "execute");

        Context context = cordova.getActivity().getApplicationContext();

        if ("capturar".equals(action)) {
            callbackContext = newCallbackContext;
            cordova.setActivityResultCallback (this);

            Log.i(TAG,"ENTRO");

            return true;
        }

        callbackContext.error("No existe metodo: " + action);
        Log.i(TAG, "error");
        return false;
    }

}