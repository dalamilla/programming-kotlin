package com.dalamilla.requestheader

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class RequestHeaderApplicationTests(@Autowired val mockMvc: MockMvc) {

    @Test
    fun testRequestHeader() {
        mockMvc
            .perform(
                get("/api/whoami")
                    .header("accept-language", "en-US")
                    .header("user-agent", "Mozilla/5.0 (X11; Linux x86_64)")
                    .contentType(MediaType.APPLICATION_JSON)
            )
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.ipaddress").value("127.0.0.1"))
            .andExpect(jsonPath("$.language").value("en-US"))
            .andExpect(jsonPath("$.software").value("Mozilla/5.0 (X11; Linux x86_64)"))
    }
}
