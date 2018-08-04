package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.views.holders

import android.support.v7.widget.RecyclerView
import android.view.View
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos.JobVO

/**
 * Created by paikhantko on 8/2/18.
 */
abstract class BaseViewHolder<W>(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener{

    protected var mData: W? = null

    init {
        itemView.setOnClickListener(this)
    }

    abstract fun setData(data: W)

}