package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.views.holders.BaseViewHolder
import java.util.ArrayList

/**
 * Created by paikhantko on 8/2/18.
 */
abstract class BaseRecyclerAdapter<W>(context:Context): RecyclerView.Adapter<BaseViewHolder>(){

    protected var mData: MutableList<W>?=null
    protected var mLayoutInflater: LayoutInflater

    val items: List<W>
        get() {
            val data = mData
            return data ?: ArrayList()
        }


    init {
        mLayoutInflater= LayoutInflater.from(context)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {

    }


}