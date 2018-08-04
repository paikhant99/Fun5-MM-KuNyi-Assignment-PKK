package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.models

import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos.JobVO
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.events.DataEvent
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.network.JobDataAgent
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.utils.AppConstants
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

/**
 * Created by paikhantko on 8/4/18.
 */
class JobAppModel {

    companion object {
        private var INSTANCE: JobAppModel? = null //lateinit keyword can be used instead of null assignment
        fun getInstance(): JobAppModel {
            if (INSTANCE == null) {
                INSTANCE = JobAppModel()
            }

            val i = INSTANCE
            return i!!   //assume to return not null
        }
    }

    private var mJobsPage: Int=1
    private var mJobsData: HashMap<Int,JobVO> = HashMap()

    private constructor() {
        EventBus.getDefault().register(this)
    }

    fun loadJobs(){
        JobDataAgent.getInstance().LoadJobsList(AppConstants.ACCESS_TOKEN,mJobsPage)
     }

    fun getJobById(jobPostId: Int): JobVO {
        return mJobsData.get(jobPostId)!!
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    fun onJobsDataLoadedEvent(dataLoadedEvent: DataEvent.JobsLoadedEvent){
        for (job: JobVO in dataLoadedEvent.jobsList) {
            mJobsData[job.jobPostId] = job
        }
    }
}