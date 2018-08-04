package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.events

/**
 * Created by paikhantko on 8/4/18.
 */
class ErrorEvent {

    class ApiErrorLoadedEvent(val throwable: Throwable? = null) {

        fun getMsg(): String? {
            if (throwable == null)
                return "Null Throwable in Error"
            else
                return throwable.message
        }
    }
}