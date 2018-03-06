package com.app.kotlindagger.ui.base

import com.app.kotlindagger.injection.component.DaggerPresenterInjector
import com.app.kotlindagger.injection.component.PresenterInjector
import com.app.kotlindagger.injection.module.ContextModule
import com.app.kotlindagger.network.NetworkModule
import com.app.kotlindagger.ui.post.PostPresenter

/**
 * Created by andrew on 3/5/2018
 */

/**
 * Base presenter any presenter of the application must extend. It provides initial injections and
 * required methods.
 * @param V the type of the View the presenter is based on
 * @property view the view the presenter is based on
 * @property injector The injector used to inject required dependencies
 * @constructor Injects the required dependencies
 */

abstract class BasePresenter<out V : BaseView>(protected val view: V) {

    /**
     * The inhector used to inject required dependencies
     */
    private val injector: PresenterInjector = DaggerPresenterInjector
            .builder()
            .baseView(view)
            .contextModule(ContextModule)
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * This method may be called when the presenter view is created
     */
    open fun onViewCreated() {}

    /**
     * This method may be called when the presenter view is destroyed
     */
    open fun onViewDestroyed() {}

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when(this) {
            is PostPresenter -> injector.inject(this)
        }
    }
}