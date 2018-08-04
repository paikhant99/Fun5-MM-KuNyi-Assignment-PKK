package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos

import com.google.gson.annotations.SerializedName

/**
 * Created by paikhantko on 8/4/18.
 */
class SkillVO(@SerializedName("skillId") var skillId: Int =0,
              @SerializedName("skillName") var skillName: String ="") {
}