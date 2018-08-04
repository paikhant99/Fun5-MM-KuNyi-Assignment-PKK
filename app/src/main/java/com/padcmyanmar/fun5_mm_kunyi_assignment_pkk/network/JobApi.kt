package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.network

import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.network.responses.GetJobsResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by paikhantko on 8/4/18.
 */
interface JobApi {

    @FormUrlEncoded
    @POST("one-time-jobs/getJobs.php")
    fun loadJobsList(@Field("access_token") accessToken: String,
                     @Field("page") page: Int): Call<GetJobsResponse>
}