package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.R
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.adapters.JobsAdapter
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.delegates.JobItemDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),JobItemDelegate {
    override fun onTapItem() {
        val intent=Intent(applicationContext,JobDetailsActivity::class.java)
        startActivity(intent)
    }

    private var mJobsAdapter: JobsAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mJobsAdapter=JobsAdapter(applicationContext,this)
        rvJobLists.adapter=mJobsAdapter
        rvJobLists.layoutManager=LinearLayoutManager(applicationContext)



    }
}
