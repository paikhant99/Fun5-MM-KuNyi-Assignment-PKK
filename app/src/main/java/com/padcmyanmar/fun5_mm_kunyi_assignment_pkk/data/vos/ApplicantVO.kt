package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos

import com.google.gson.annotations.SerializedName

/**
 * Created by paikhantko on 8/4/18.
 */
class ApplicantVO {

    @SerializedName("appliedDate")
    val appliedDate: String =""

    @SerializedName("canLowerOfferAmount")
    val canLowerOfferAmount: Boolean =false

    @SerializedName("seekerId")
    val seekerId: Int =0

    @SerializedName("seekerName")
    val seekerName: String =""

    @SerializedName("seekerProfilePicUrl")
    val seekerProfilePicUrl: String =""

    @SerializedName("seekerSkill")
    val seekerSkill: List<SkillVO> =ArrayList()

    @SerializedName("whyShouldHire")
    val whyShouldHire: List<HireMsgVO> =ArrayList()
}