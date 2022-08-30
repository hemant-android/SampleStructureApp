package com.example.samplestructureapp.model.response

data class NotificationListResponse(
    val `data`: Data,
    val message: String,
    val status: Boolean
) {
    data class Data(
        val notificationList: ArrayList<Notification>
    ) {
        data class Notification(
            val description: String,
            val id: String,
            val user_id: String,
            val title: String,
            val userimage: String
        )
    }
}