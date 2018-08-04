package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos

import com.google.gson.annotations.SerializedName

/**
 * Created by paikhantko on 8/4/18.
 */
class JobDurationVO(@SerializedName("jobEndDate") var jobEndDate: String ="",
                    @SerializedName("jobStartDate") var jobStartDate: String ="",
                    @SerializedName("totalWorkingDays") var totalWorkingDays: Int =0,
                    @SerializedName("workingDaysPerWeek") var workingDaysPerWeek: Int =0,
                    @SerializedName("workingHoursPerDay") var workingHoursPerDay: Double =0.0) {
}