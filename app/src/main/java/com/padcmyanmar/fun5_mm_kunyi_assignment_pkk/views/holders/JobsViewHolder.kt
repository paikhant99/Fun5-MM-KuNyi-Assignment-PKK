package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.views.holders

import android.view.View
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.delegates.JobItemDelegate

/**
 * Created by paikhantko on 8/2/18.
 */
class JobsViewHolder(itemView:View,private val jobItemDelegate: JobItemDelegate):BaseViewHolder(itemView) {

    override fun onClick(v: View){
        jobItemDelegate.onTapItem()
    }
}