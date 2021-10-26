package com.app.socialnetworktwitch.domain.models

import com.app.socialnetworktwitch.domain.util.ActivityAction

data class Activity(
    val username: String,
    val actionType: ActivityAction,
    val formattedTime: String,
)