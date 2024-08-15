package de.os.dehaar.dokos.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DokOsRestApiApplication

fun main(args: Array<String>) {
	runApplication<DokOsRestApiApplication>(*args)
}
