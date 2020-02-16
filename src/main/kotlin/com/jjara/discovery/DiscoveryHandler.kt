package com.jjara.discovery

import com.jjara.discovery.beans.Application
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DiscoveryHandler {

    private var applications = ArrayList<Application>();

    @PostMapping("/v1/discovery")
    fun register(@RequestBody application: Application) {
        applications.add(application);
    }

    @GetMapping("/v1/discovery")
    private fun fetchAll() = applications
}