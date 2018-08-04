package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.R
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.adapters.JobsAdapter
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.models.JobAppModel
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos.JobVO
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.delegates.JobItemDelegate
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.events.DataEvent
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.events.ErrorEvent
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.utils.AppConstants
import kotlinx.android.synthetic.main.activity_main.*
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class MainActivity : BaseActivity(),JobItemDelegate {
    override fun onTapItem(jobVO: JobVO?) {
        val intent=Intent(applicationContext,JobDetailsActivity::class.java)
        intent.putExtra(AppConstants.JOB_POST_ID,jobVO!!.jobPostId)
        startActivity(intent)
    }

    private var mJobsAdapter: JobsAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mJobsAdapter=JobsAdapter(applicationContext,this)
        rvJobLists.adapter=mJobsAdapter
        rvJobLists.layoutManager=LinearLayoutManager(applicationContext)

        swipeRefreshLayout.isRefreshing=true
        JobAppModel.getInstance().loadJobs()

        swipeRefreshLayout.setOnRefreshListener {
            JobAppModel.getInstance().loadJobs()
        }

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onDataLoadedEvent(dataLoadedEvent: DataEvent.JobsLoadedEvent){
        mJobsAdapter!!.setJobsData(dataLoadedEvent.jobsList as MutableList<JobVO>)
        swipeRefreshLayout!!.isRefreshing=false
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onNetworkFailureEvent(error: ErrorEvent.ApiErrorLoadedEvent){
        swipeRefreshLayout!!.isRefreshing=false
        Snackbar.make(rvJobLists,"Netowrk Failed"+error.getMsg(),Snackbar.LENGTH_LONG).show()
    }
}
