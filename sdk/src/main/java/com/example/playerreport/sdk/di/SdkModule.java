package com.example.playerreport.sdk.di;

import android.app.Application;
import android.content.Context;

import com.example.playerreport.sdk.Sdk;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gufei on 2017/2/6 0006.
 */
@Module
public class SdkModule {


    @Singleton
    @Provides
    Sdk provideSdk(Context context) {
        return new Sdk(context);
    }
}
