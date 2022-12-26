package com.kastro.aop_api.models

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Ritual(
    val ritualId: String = "",
    val name: String = "",
    val circle: Int = 0,
    val element: String = "",
    val executionType: String = "",
    val range: String = "",
    val target: String = "",
    val duration: String = "",
    val description: String = "",
    val studentDescription: String = "",
    val realDescription: String = "",
    val resistance: String = ""
)