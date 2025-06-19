package de.os.dehaar.dokos.api.controller

import de.os.dehaar.dokos.api.entity.Round
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rounds")
class RoundController {

    @PostMapping("/create")
    fun create(@RequestParam location: String): ResponseEntity<Round> {

    }
}