package com.example.playerreport.sdk.di;

import com.example.playerreport.sdk.BaseComponent;
import com.example.playerreport.sdk.PlayActivity;


import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;

/**
 * This class is in debug/ folder. You can use it to define injects or getters for dependencies only in debug variant
 */
@Subcomponent(modules = { SdkModule.class})
public interface SdkComponent  extends BaseComponent {

    void inject(PlayActivity app);
}
