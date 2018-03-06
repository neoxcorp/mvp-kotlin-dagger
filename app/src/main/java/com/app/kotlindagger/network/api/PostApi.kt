package com.app.kotlindagger.network.api

import com.app.kotlindagger.dto.response.Post
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by andrew on 3/5/2018
 */

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {

    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<Post>
}