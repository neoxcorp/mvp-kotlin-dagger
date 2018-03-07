package com.app.ui.base

import android.content.Context

/**
 * Created by andrew on 3/5/2018
 */

/**
 * Base view any view must implement.
 */

interface BaseView{

    /**
     * Returns the context in which the application is running.
     * @return the context in which the application is running
     */

    fun getContext() : Context
}