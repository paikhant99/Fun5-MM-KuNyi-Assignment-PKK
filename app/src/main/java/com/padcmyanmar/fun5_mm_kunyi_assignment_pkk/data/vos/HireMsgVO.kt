package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos

import com.google.gson.annotations.SerializedName

/**
 * Created by paikhantko on 8/4/18.
 */
class HireMsgVO(@SerializedName("msg") var msg: String ="",
                @SerializedName("timestamp") var timestamp: String ="",
                @SerializedName("whyShouldHireId") var whyShouldHireId: Int =0) {
}