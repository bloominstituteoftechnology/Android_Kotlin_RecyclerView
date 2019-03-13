package com.jbseppanen.android_kotlin_recyclerview

import kotlinx.serialization.Serializable

@Serializable
data class SomethingToDo(
    val accessibility: Double,
    val activity: String,
    val key: String,
    val link: String,
    val participants: Int,
    val price: Double,
    val type: String
)
