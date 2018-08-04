package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.R
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.models.JobAppModel
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos.JobVO
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.utils.AppConstants
import kotlinx.android.synthetic.main.activity_job_details.*
import kotlinx.android.synthetic.main.view_item_job.*

/**
 * Created by paikhantko on 8/3/18.
 */
class JobDetailsActivity:BaseActivity() {

    @SuppressLint("StringFormatMatches")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_details)

        val jobPostId=intent.getIntExtra(AppConstants.JOB_POST_ID,0)
        val job: JobVO=JobAppModel.getInstance().getJobById(jobPostId)

        tvJobDesc.text="\t"+job.fullDesc
        tvDetailsTitle.text=tvDetailsTitle.context.resources.getString(R.string.format_job_title,job.shortDesc)
        tvDetailsLocation.text=tvDetailsLocation.context.resources.getString(R.string.format_location,job.location)
        tvDetailsPayment.text=tvDetailsPayment.context.resources.getString(R.string.format_payment_duration,job.offerAmount!!.amount,job.offerAmount!!.duration)
        tvDetailsPostDate.text=tvDetailsPostDate.context.resources.getString(R.string.format_posted_date,job.postedDate)
        tvDetailsPostClosedDate.text=tvDetailsPostClosedDate.context.resources.getString(R.string.format_post_closed_date,job.postClosedDate)
        tvDetailsVacancy.text=tvDetailsVacancy.context.resources.getString(R.string.format_vacancy,job.availablePostCount)
        tvDetailsDates.text=tvDetailsDates.context.resources.getString(R.string.format_dates,job.jobDuration!!.jobStartDate,job.jobDuration!!.jobEndDate)
        tvDetailsContactEmail.text=tvDetailsContactEmail.context.resources.getString(R.string.format_email,job.email)
        tvDetailsContactPhno.text=tvDetailsContactPhno.context.resources.getString(R.string.format_phone_no,job.phoneNo)
        var notes=""
        for(note: String in job.importantNotes!!){
            notes+="-"+note+"\n"
        }
        tvImportantNotes.text=notes

    }
}