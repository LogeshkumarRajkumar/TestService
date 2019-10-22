package com.example.TestService.Controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class TestServiceController {

    @RequestMapping("/failure")
    fun failure() {
        throw RuntimeException("Failure")
    }
}
