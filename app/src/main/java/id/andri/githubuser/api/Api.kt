package id.andri.githubuser.api

import id.andri.githubuser.data.model.DetailUserResponse
import id.andri.githubuser.data.model.User
import id.andri.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 50d98b82171c5e9aa0c5383e16fc2d436c84c83d")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 50d98b82171c5e9aa0c5383e16fc2d436c84c83d")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 50d98b82171c5e9aa0c5383e16fc2d436c84c83d")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 50d98b82171c5e9aa0c5383e16fc2d436c84c83d")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}