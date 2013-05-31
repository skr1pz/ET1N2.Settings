package com.et1n2.settings;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.provider.Settings;
import android.app.Activity;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.hardware.*;

public class MainActivity extends Activity
{
	
	private void setSleepPolicy(Context paramContext)
	 
 {
		//Settings.System.putInt(paramContext.getContentResolver(), "wifi_sleep_policy", 2);
		//Settings.System.putInt(paramContext.getContentResolver(), "screen_timeout", 3);
		//Settings.System.putInt(paramContext.getContentResolver(), "show_password", 0);
		//Settings.System.putInt(paramContext.getContentResolver(), "technology_preferences", 1);
		android.provider.Settings.System.putInt(getContentResolver(), Settings.System.SCREEN_OFF_TIMEOUT, 600000);
		//android.provider.Settings.System.putInt(getContentResolver(), Settings.System.DEVICE_PROVISIONED, 1);
		//android.provider.Settings.System.putInt(getContentResolver(), Settings.System.TECHNOLOGY_NETWORK_MODE_ENTRIES, 0);
		android.provider.Settings.System.putInt(getContentResolver(), Settings.System.TEXT_SHOW_PASSWORD, 0);
		//Settings.System.putInt(paramContext.getContentResolver(), "Technology_preferences", 0);
		//android.telephony.cdma.CdmaCellLocation())
		android.provider.Settings.System.putInt(getContentResolver(), Settings.Global.WIFI_SLEEP_POLICY, 2);
		//android.telephony.TelephonyManager.NETWORK_TYPE_EVDO_A;
		//Telephony.TelephonyManager(getContentResolver(), TelephonyManager.NETWORK_TYPE_EVDO_A);
		Camera.Parameters.this.setPictureSize(1600, 1200);
		//android.hardware.Camera.Parameters.setInt(getContentResolver(), Camera.Parameters.this.setPictureSize(1600, 1200);
 }
	
	protected void onCreate(Bundle paramBundle)
	{
		super.onCreate(paramBundle);
		setSleepPolicy(getApplicationContext());
		finish();
	}
}	
	