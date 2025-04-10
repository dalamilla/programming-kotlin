package com.dalamilla.requestheader

import com.dalamilla.requestheader.model.Whoami
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {

    @Test
    fun testWhoami() = testApplication {
        application { module() }

        val client = createClient { install(ContentNegotiation) { json() } }

        val response =
            client.get("/api/whoami") {
                header("accept-language", "en-US")
                header("user-agent", "Mozilla/5.0 (X11; Linux x86_64)")
            }
        val whoami: Whoami = response.body()

        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals(whoami, Whoami("localhost", "en-US", "Mozilla/5.0 (X11; Linux x86_64)"))
    }
}
