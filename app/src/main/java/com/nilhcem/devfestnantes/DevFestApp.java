package com.nilhcem.devfestnantes;

import android.app.Application;
import android.content.Context;

import com.jakewharton.threetenabp.AndroidThreeTen;
import com.nilhcem.devfestnantes.core.dagger.AppComponent;

import hugo.weaving.DebugLog;
import timber.log.Timber;

@DebugLog
public class DevFestApp extends Application {

    private AppComponent component;

    public static DevFestApp get(Context context) {
        return (DevFestApp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidThreeTen.init(this);
        initGraph();
        initLogger();
    }

    public AppComponent component() {
        return component;
    }

    private void initGraph() {
        component = AppComponent.Initializer.init(this);
    }

    private void initLogger() {
        Timber.plant(new Timber.DebugTree());
    }
}