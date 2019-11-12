package com.seki.kotlinspringboot.controller.api

import com.seki.kotlinspringboot.controller.BaseController
import com.seki.kotlinspringboot.data.Message
import com.seki.kotlinspringboot.data.MessageJson
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(
    path = [
        "/hello/api"
    ],
    produces = [MediaType.APPLICATION_JSON_VALUE]
)
@RestController
class HelloApiController : BaseController() {
    @GetMapping("message/{id}")
    fun fetch(
        @PathVariable id: String
    ): MessageJson {
        return MessageJson(
            Message.of(id).message()
        )
    }

    data class UpdateRequestBody(val id: String)

    @PostMapping("message/update")
    fun update(
        @RequestBody requestBody: UpdateRequestBody
    ): MessageJson {
        println(requestBody.id)
        return MessageJson(
            Message.of(requestBody.id).message()
        )
    }
}
