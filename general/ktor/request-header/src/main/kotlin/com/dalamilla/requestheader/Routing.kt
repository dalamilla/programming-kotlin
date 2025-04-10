package com.dalamilla.requestheader

import com.dalamilla.requestheader.model.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        get("/api/whoami") {
            val ip = call.request.local.remoteAddress
            val language = call.request.header("accept-language")
            val software = call.request.header("user-agent")

            call.respond(Whoami(ip, language, software))
        }
    }
}
