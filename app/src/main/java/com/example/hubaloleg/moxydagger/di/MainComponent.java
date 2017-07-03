package com.example.hubaloleg.moxydagger.di;

import com.example.hubaloleg.moxydagger.ui.activity.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hubaloleg on 30.06.17.
 */

@Component(modules = {MainModule.class})
@Singleton
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
