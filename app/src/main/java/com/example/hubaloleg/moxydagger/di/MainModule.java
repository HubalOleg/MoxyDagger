package com.example.hubaloleg.moxydagger.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hubaloleg on 30.06.17.
 */

@Module
public class MainModule {

    @Provides
    @Singleton
    public String provideString() {
        return "Message with Dagger";
    }
}
