package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.adapters

import android.content.Context
import android.view.ViewGroup
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.R
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos.JobVO
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.delegates.JobItemDelegate
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.views.holders.BaseViewHolder
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.views.holders.JobsViewHolder

/**
 * Created by paikhantko on 8/2/18.
 */
class JobsAdapter(context:Context,val jobItemDelegate: JobItemDelegate):BaseRecyclerAdapter<JobsViewHolder,JobVO>(context) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobsViewHolder{
        val itemView=mLayoutInflater.inflate(R.layout.view_item_job,parent,false)
        return JobsViewHolder(itemView,jobItemDelegate)
    }
}