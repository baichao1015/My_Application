package com.example.baichao.myapplication;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by 58 on 2015/7/31.
 */
public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                        .build());
    }
}