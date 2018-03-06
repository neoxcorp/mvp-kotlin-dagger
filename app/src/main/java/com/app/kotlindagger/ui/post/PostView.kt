package com.app.kotlindagger.ui.post

import android.support.annotation.StringRes
import com.app.kotlindagger.model.Post
import com.app.kotlindagger.ui.base.BaseView

/**
 * Created by andrew on 3/6/2018
 */

/**
 * Interface providing required method for a view displaying posts
 */
interface PostView : BaseView {

    /**
     * Updates the previous posts by the specified ones
     * @param posts the list of posts that will replace existing ones
     */
    fun updatePosts(posts: List<Post>)

    /**
     * Displays an error in the view
     * @param error the error to display in the view
     */
    fun showError(error: String)

    /**
     * Displays an error in the view
     * @param errorResId the resource id of the error to display in the view
     */
    fun showError(@StringRes error: Int)

    /**
     * Displays the loading indicator of the view
     */
    fun showLoading()

    /**
     * Hides the loading indicator of the view
     */
    fun hideLoading()

}