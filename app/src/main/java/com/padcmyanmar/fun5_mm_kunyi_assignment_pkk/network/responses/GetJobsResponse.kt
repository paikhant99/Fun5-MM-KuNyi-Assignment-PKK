package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.network.responses

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos.JobVO

/**
 * Created by paikhantko on 8/4/18.
 */
class GetJobsResponse {

    @SerializedName("code")
    private val code: Int =0

    @SerializedName("message")
    private val message: String =""

    @SerializedName("apiVersion")
    private val apiVersion: String =""

    @SerializedName("jobs")
    private var jobs: List<JobVO> ?=null

    fun getCode(): Int {
        return code
    }

    fun getMessage(): String? {
        return message
    }

    fun getApiVersion(): String? {
        return apiVersion
    }

    fun getJobsList(): List<JobVO> {
        if (jobs == null) {
            jobs = ArrayList<JobVO>()
        }
        val jobsVal = jobs
        return jobsVal!!
    }
}