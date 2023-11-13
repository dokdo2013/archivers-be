package com.archivers.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ArchiversBeApplication

fun main(args: Array<String>) {
    runApplication<ArchiversBeApplication>(*args)
}
