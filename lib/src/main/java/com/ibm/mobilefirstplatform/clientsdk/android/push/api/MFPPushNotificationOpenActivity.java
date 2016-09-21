package com.ibm.mobilefirstplatform.clientsdk.android.push.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.ibm.mobilefirstplatform.clientsdk.android.push.internal.MFPInternalPushMessage;

import static com.ibm.mobilefirstplatform.clientsdk.android.push.internal.MFPPushConstants.NOTIFICATIONID;

/**
 * Created by jialfred on 9/20/16.
 */

public class MFPPushNotificationOpenActivity extends Activity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        MFPPush.getInstance().getMessagesFromSharedPreferences(getIntent().getIntExtra(NOTIFICATIONID, 0));
        finish();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        MFPPush.getInstance().getMessagesFromSharedPreferences(getIntent().getIntExtra(NOTIFICATIONID, 0));
        finish();
    }

}
