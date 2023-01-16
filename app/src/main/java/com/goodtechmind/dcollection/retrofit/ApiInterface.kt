package com.goodtechmind.dcollection.retrofit

import com.goodtechmind.dcollection.model.LoginModel
import com.goodtechmind.dcollection.model.customer_details.CustomerDetailsModel
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {

    @POST("login/loan/collector")
    suspend fun loginUser(
        @Field("username") username: String,
        @Field("password") password: String) : Response<LoginModel>


    @GET("customer/details")
    suspend fun getCustomerDetails():Response<CustomerDetailsModel>
}