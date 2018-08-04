package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.events

import com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos.JobVO

/**
 * Created by paikhantko on 8/4/18.
 */
class DataEvent {

    class JobsLoadedEvent(val jobsList: List<JobVO>)

    class EmptyDataLoadedEvent()
}