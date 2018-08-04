package com.padcmyanmar.fun5_mm_kunyi_assignment_pkk.data.vos

import com.google.gson.annotations.SerializedName

/**
 * Created by paikhantko on 8/4/18.
 */
class JobVO(applicants: List<ApplicantVO> =ArrayList(),
            vacancy: Int=0,
            email: String="",
            fullDesc: String="",
            genderForJob: Int=0,
            images: List<String> =ArrayList(),
            ImportantNotes: List<String> =ArrayList(),
            interested: List<SeekerVO> =ArrayList(),
            isActive: Boolean=false,
            jobDuration: JobDurationVO?=null,
            jobPostId: Int=0,
            jobTags: List<JobTagVO> =ArrayList(),
            location: String ="",
            makeMoneyRating: Int =0,
            offerAmount: OfferAmountVO?=null,
            phoneNo: String ="",
            postClosedDate: String ="",
            postedDate: String ="",
            relevant: List<RelevantVO> =ArrayList(),
            requiredSkill: List<SkillVO> =ArrayList(),
            shortDesc: String ="",
            viewed: List<SeekerVO> =ArrayList()) {


    @SerializedName("availablePostCount")
    var availablePostCount: Int=vacancy

    @SerializedName("email")
    var email: String=email

    @SerializedName("fullDesc")
    var fullDesc: String=fullDesc

    @SerializedName("genderForJob")
    var genderForJob: Int=genderForJob

    @SerializedName("isActive")
    var isActive: Boolean=isActive

    @SerializedName("jobDuration")
    var jobDuration: JobDurationVO?=jobDuration

    @SerializedName("jobPostId")
    var jobPostId: Int=jobPostId

    @SerializedName("location")
    var location: String=location

    @SerializedName("makeMoneyRating")
    var makeMoneyRating: Int=makeMoneyRating

    @SerializedName("offerAmount")
    var offerAmount: OfferAmountVO?=offerAmount

    @SerializedName("phoneNo")
    var phoneNo: String=phoneNo

    @SerializedName("postClosedDate")
    var postClosedDate: String=postClosedDate

    @SerializedName("postedDate")
    var postedDate: String=postedDate

    @SerializedName("shortDesc")
    var shortDesc: String=shortDesc

    @SerializedName("applicant")
    var applicants: List<ApplicantVO>? = applicants
    get() {
        return if (field == null)
            ArrayList()
        else
            field
    }


    @SerializedName("images")
    var images: List<String>? = images
        get() {
            return if (field == null)
                ArrayList()
            else
                field
        }

    @SerializedName("importantNotes")
    var importantNotes: List<String>? = ImportantNotes
        get() {
            return if (field == null)
                ArrayList()
            else
                field
        }

    @SerializedName("interested")
    var interested: List<SeekerVO>? = interested
        get() {
            return if (field == null)
                ArrayList()
            else
                field
        }

    @SerializedName("jobTags")
    var jobTags: List<JobTagVO>? = jobTags
        get() {
            return if (field == null)
                ArrayList()
            else
                field
        }


    @SerializedName("relevant")
    var relevant: List<RelevantVO>? = relevant
        get() {
            return if (field == null)
                ArrayList()
            else
                field
        }

    @SerializedName("requiredSkill")
    var requiredSkill: List<SkillVO>? = requiredSkill
        get() {
            return if (field == null)
                ArrayList()
            else
                field
        }

    @SerializedName("viewed")
    var viewed: List<SeekerVO>? = viewed
        get() {
            return if (field == null)
                ArrayList()
            else
                field
        }
}