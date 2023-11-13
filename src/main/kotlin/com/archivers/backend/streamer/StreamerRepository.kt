package com.archivers.backend.streamer

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StreamerRepository: JpaRepository<StreamerEntity, Long> {
    fun getAllByOrderByTwitchDisplayName(): List<StreamerEntity>
//    fun findByTwitchId(twitchId: Long): StreamerEntity?
//    fun findByTwitchName(twitchName: String): StreamerEntity?
//    fun findByTwitchDisplayName(twitchDisplayName: String): StreamerEntity?
//    fun findByTwitchIdOrTwitchNameOrTwitchDisplayName(twitchId: Long, twitchName: String, twitchDisplayName: String): StreamerEntity?
}