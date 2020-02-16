package com.jjara.discovery

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    private val counter = AtomicLong()

    @GetMapping("/greeting")
    private fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
        val a = name(name)
        return Greeting(counter.incrementAndGet(), "Hello, $name $a")
    }

    private fun name(name: String) = "jonathan"


}