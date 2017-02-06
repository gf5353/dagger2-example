package net.grzechocinski.android.dagger2example.internal.di;

import com.example.playerreport.sdk.di.SdkComponent;
import com.example.playerreport.sdk.di.SdkModule;

import dagger.Component;

import javax.inject.Singleton;

import net.grzechocinski.android.dagger2example.home.BaseActivity;

/**
 * This class is in debug/ folder. You can use it to define injects or getters for dependencies only in debug variant
 */
@Singleton
@Component(modules = {DebugDependenciesModule.class, SystemServicesModule.class, D2EUtilsModule.class, SdkModule.class})
public interface D2EComponent extends D2EGraph {

    void inject(BaseActivity baseActivity);

    SdkComponent provideSdkComponent();
}
