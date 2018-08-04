package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos

import com.google.gson.annotations.SerializedName

/**
 * Created by paikhantko on 8/4/18.
 */
class OfferAmountVO(@SerializedName("amount") var amount: Long=0,
                    @SerializedName("duration") var duration: String ="") {
}