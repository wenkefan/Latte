package com.fwk.latte.core.app;

import android.content.Context;

import java.util.HashMap;


/**
 * Created by 范文轲 on 2018/1/14.
 */

public final class Latte {
    public static Configurator init(Context context){
        Configurator.getInstance()
                .getLatteConfigs()
                .put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static Configurator getConfigurations(){
        return Configurator.getInstance();
    }

    public static <T> T getConfiguration(Object key){
        return getConfigurations().getConfiguration(key);
    }

    public static Context getApplication(){
        return (Context) getConfiguration(ConfigType.APPLICATION_CONTEXT);
    }
}
