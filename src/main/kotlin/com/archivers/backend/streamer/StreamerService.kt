package com.archivers.backend.streamer

import org.springframework.stereotype.Component

@Component
class StreamerService(
    private val streamerRepository: StreamerRepository
) {
    fun getAll(): List<StreamerEntity> {
        return streamerRepository.getAllByOrderByTwitchDisplayName()
    }

}