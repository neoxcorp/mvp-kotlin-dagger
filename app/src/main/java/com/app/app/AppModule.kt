package com.app.app

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by andrew on 3/5/2018
 */

@Module
class AppModule(val app: App) {

    @Provides @Singleton fun provideApp() = app

}