package com.example.playerreport.sdk;

/**
 * Created by gufei on 2017/2/6 0006.
 */

public class SdkComponentBuilder {
    private static SdkComponentBuilder sdkComponentBuilder;
    private IFindComponent iFindComponent;

    public static SdkComponentBuilder getInstance() {
        if (sdkComponentBuilder == null) {
            sdkComponentBuilder = new SdkComponentBuilder();
        }
        return sdkComponentBuilder;
    }

    public BaseComponent findComponent(Class cls) {
        return iFindComponent != null ? iFindComponent.findComponent(cls) : null;
    }


    public void setiFindComponent(IFindComponent iFindComponent) {
        this.iFindComponent = iFindComponent;
    }

    public interface IFindComponent {
        BaseComponent findComponent(Class cls);
    }
}
