package com.dalamilla.requestheader.model

import kotlinx.serialization.Serializable

@Serializable
data class Whoami(val ipaddress: String?, val language: String?, val software: String?)
