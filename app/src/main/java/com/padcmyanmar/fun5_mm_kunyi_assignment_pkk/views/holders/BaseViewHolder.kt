package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.views.holders

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by paikhantko on 8/2/18.
 */
abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener{

    init {
        itemView.setOnClickListener(this)
    }

}