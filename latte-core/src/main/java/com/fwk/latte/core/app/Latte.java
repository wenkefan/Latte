package com.fwk.latte.core.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * Created by 范文轲 on 2018/1/14.
 */

public final class Latte {
    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String,Object> getConfigurations(){
        return Configurator.getInstance().getLatteConfigs();
    }
}
