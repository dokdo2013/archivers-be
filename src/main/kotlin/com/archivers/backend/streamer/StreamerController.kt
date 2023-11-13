package com.archivers.backend.streamer

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Streamer", description = "Streamer API")
@RestController
@RequestMapping("/")
class StreamerController(
    private val streamerService: StreamerService
) {

    @GetMapping("/streamer")
    fun getStreamer(): List<StreamerEntity> {
        return streamerService.getAll()
    }

    @GetMapping("/streamer/{id}")
    fun getStreamerById(@PathVariable id: String): String {
        // TODO: Implement this
        return "Streamer by ID"
    }
}