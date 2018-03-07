package com.app.kotlindagger.app

import dagger.Component
import javax.inject.Singleton

/**
 * Created by andrew on 3/5/2018
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(app: App)

}