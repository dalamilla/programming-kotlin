package com.dalamilla.requestheader

import jakarta.servlet.http.HttpServletRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class RequestHeaderController {

    @GetMapping("/whoami")
    fun whoamiApi(request: HttpServletRequest): Whoami {
        val ipaddress: String = request.getRemoteAddr()
        val language: String = request.getHeader("accept-language")
        val software: String = request.getHeader("user-agent")

        return Whoami(ipaddress, language, software)
    }
}
