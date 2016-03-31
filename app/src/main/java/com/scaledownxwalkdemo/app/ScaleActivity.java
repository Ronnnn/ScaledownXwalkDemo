package com.scaledownxwalkdemo.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkView;

public class ScaleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		XWalkPreferences.setValue(XWalkPreferences.ANIMATABLE_XWALK_VIEW, true);
		XWalkPreferences.setValue(XWalkPreferences.JAVASCRIPT_CAN_OPEN_WINDOW, false);
		XWalkPreferences.setValue(XWalkPreferences.SUPPORT_MULTIPLE_WINDOWS, false);
		XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, false);

		setContentView(R.layout.activity_scale);

		XWalkView webView = (XWalkView) findViewById(R.id.webviewlayer);
		webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);

		webView.load("file:///android_asset/index.html", null);

	}
}
