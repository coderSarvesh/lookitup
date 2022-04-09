package com.psp.lookitup.data

import java.text.DateFormat

data class User(

    val id: Int,
    val name: String? = "",
    val emailId: String? = "",
    val DOB: DateFormat? = null,
    val gender: String?= "",
    val Status: String? = "",
    val occupation: String? = "",
    val location: String? = "",

)

