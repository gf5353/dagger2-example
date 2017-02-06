package com.example.playerreport.sdk;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.playerreport.sdk.di.SdkComponent;

import javax.inject.Inject;

public class PlayActivity extends FragmentActivity {
    SdkComponent sdkComponent;
    @Inject
    Sdk sdk;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sdkComponent = (SdkComponent) SdkComponentBuilder.getInstance().findComponent(SdkComponent.class);
        if (sdkComponent == null) return;
        sdkComponent.inject(this);
        sdk.log("onCreate^^^^^^");
        sdk.toast("PlayActivity init");
    }
}
