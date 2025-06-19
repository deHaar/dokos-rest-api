package de.os.dehaar.dokos.api.controller

import de.os.dehaar.dokos.api.entity.Round
import de.os.dehaar.dokos.api.service.RoundService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rounds")
class RoundController(var roundService: RoundService) {

    @PostMapping("/create")
    fun create(@RequestParam location: String): ResponseEntity<Round> {
        return ResponseEntity.ok(roundService.create(location))
    }
}