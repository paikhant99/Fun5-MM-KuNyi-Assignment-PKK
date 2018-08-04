package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.network

import com.google.gson.Gson
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.events.DataEvent
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.events.ErrorEvent
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.network.responses.GetJobsResponse
import okhttp3.OkHttpClient
import org.greenrobot.eventbus.EventBus
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by paikhantko on 8/4/18.
 */
class JobDataAgent {

    companion object {
        private var INSTANCE: JobDataAgent? = null
        fun getInstance(): JobDataAgent {
            if (INSTANCE == null) {
                INSTANCE = JobDataAgent()
            }

            val i = INSTANCE
            return i!!
        }
    }

    private val mJobApi: JobApi

    private constructor(){
        val okHttpClient = OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build()

        val retrofit = Retrofit.Builder()
                .baseUrl("http://padcmyanmar.com/padc-3/final-projects/")
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .client(okHttpClient)
                .build()

        mJobApi = retrofit.create(JobApi::class.java)
    }

    fun LoadJobsList(accessToken: String,page: Int){
        val jobResponseCall =mJobApi.loadJobsList(accessToken,page)
        jobResponseCall.enqueue(object : Callback<GetJobsResponse>{
            override fun onFailure(call: Call<GetJobsResponse>?, t: Throwable?) {
                EventBus.getDefault().post(ErrorEvent.ApiErrorLoadedEvent(t))
            }

            override fun onResponse(call: Call<GetJobsResponse>?, response: Response<GetJobsResponse>?) {
                val jobsResponse: GetJobsResponse?=response!!.body()
                if(jobsResponse!=null){
                    val jobLoadedEvent=DataEvent.JobsLoadedEvent(jobsResponse.getJobsList())
                    EventBus.getDefault().post(jobLoadedEvent)
                }else{
                    val emptyLoadedEvent=DataEvent.EmptyDataLoadedEvent()
                    EventBus.getDefault().post(emptyLoadedEvent)
                }
            }
        })
    }
}