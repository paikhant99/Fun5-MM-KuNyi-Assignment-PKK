package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.views.holders

import android.view.View
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.R
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos.JobVO
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.delegates.JobItemDelegate
import kotlinx.android.synthetic.main.view_item_job.view.*

/**
 * Created by paikhantko on 8/2/18.
 */
class JobsViewHolder(itemView:View,private val jobItemDelegate: JobItemDelegate):BaseViewHolder<JobVO>(itemView) {

    override fun onClick(v: View) {
        jobItemDelegate.onTapItem(mData)
    }

    override fun setData(jobVO: JobVO) {
        mData=jobVO
        itemView.tvShortDesc.text = jobVO.shortDesc
        itemView.tvOfferAmount.text="$ "+jobVO.offerAmount!!.amount.toString()
        itemView.tvOfferAmountDuration.text=jobVO.offerAmount!!.duration
        itemView.tvLocation.text = jobVO.location
        itemView.tvInterestedCount.text=itemView.tvInterestedCount.context.resources.getString(R.string.format_interested_count, jobVO.interested!!.size.toString())
        itemView.tvViewedCount.text=itemView.tvViewedCount.context.resources.getString(R.string.format_viewed_count,jobVO.viewed!!.size.toString())
        itemView.tvAppliedCount.text=itemView.tvAppliedCount.context.resources.getString(R.string.format_applied_count,jobVO.applicants!!.size.toString())
    }
}