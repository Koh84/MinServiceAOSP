package com.android.server;

import android.content.Context;
import android.os.ISerialSysService;
import android.util.Log;

public class SerialSysService extends ISerialSysService.Stub
{
	private static final String TAG = "SerialSys";
	private Context mContext;

	public SerialSysService(Context context) {

		mContext = context;
		Log.i(TAG, "Kelvin Serial System Service started");
		//Log.i(TAG, "test() returns " + test_native(mNativePointer, 20));
    	}
	

	public String read_timed(int maxLength, int timeout) 
	{
		return new String("read_timed");
	}

	public String read(int maxLength)
	{
		return new String("read");
	}

	public int write(String mString) 
	{
		Log.v(TAG, "Kelvin Koh Serial write ");
		return 1;
	}

	public int enable_serial() 
	{
		Log.v(TAG, "Kelvin Koh Serial enable_serial");
		return 1;
	}

	public int disable_serial() 
	{
		Log.v(TAG, "Kelvin Koh Serial disable_serial");
		return 1;
	}
}
