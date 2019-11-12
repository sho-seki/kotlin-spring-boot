package com.seki.kotlinspringboot.controller.page

import com.seki.kotlinspringboot.controller.BaseController
import com.seki.kotlinspringboot.data.Hello
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController : BaseController() {
    @GetMapping("/hello")
    fun hello(): Hello {
        // TODO テンプレート
        return Hello()
    }
}
