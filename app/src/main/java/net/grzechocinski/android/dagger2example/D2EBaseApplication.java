package net.grzechocinski.android.dagger2example;

import android.app.Application;
import android.content.Context;

import com.example.playerreport.sdk.BaseComponent;
import com.example.playerreport.sdk.SdkComponentBuilder;
import com.example.playerreport.sdk.di.SdkComponent;
import com.example.playerreport.sdk.di.SdkModule;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import net.grzechocinski.android.dagger2example.internal.di.D2EComponent;

import net.grzechocinski.android.dagger2example.internal.di.DaggerD2EComponent;
import net.grzechocinski.android.dagger2example.internal.di.SystemServicesModule;

public abstract class D2EBaseApplication extends Application {

    private D2EComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        buildComponentAndInject();
    }

    public void buildComponentAndInject() {
        component = DaggerComponentInitializer.init(this);
        SdkComponentBuilder.getInstance().setiFindComponent(cls -> {
            if (cls == null) return null;
            if (cls == SdkComponent.class) {
                return component.provideSdkComponent();
            }
            return null;
        });
    }

    public static D2EComponent component(Context context) {
        return ((D2EBaseApplication) context.getApplicationContext()).component;
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public final static class DaggerComponentInitializer {

        public static D2EComponent init(D2EBaseApplication app) {
            return DaggerD2EComponent.builder()
                    .systemServicesModule(new SystemServicesModule(app))
                    .sdkModule(new SdkModule())
                    .build();
        }

    }
}
