package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos

import com.google.gson.annotations.SerializedName

/**
 * Created by paikhantko on 8/4/18.
 */
class SeekerVO {

    @SerializedName("interestedTimeStamp")
    val interestedTimeStamp: String =""

    @SerializedName("seekerId")
    val seekerId: Int =0

    @SerializedName("seekerName")
    val seekerName: String =""

    @SerializedName("seekerProfilePicUrl")
    val seekerProfilePicUrl: String =""

    @SerializedName("seekerSkill")
    val seekerSkill: List<SkillVO> =ArrayList()
}