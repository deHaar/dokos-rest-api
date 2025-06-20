package de.os.dehaar.dokos.api.controller

import de.os.dehaar.dokos.api.entity.Player
import de.os.dehaar.dokos.api.entity.Round
import de.os.dehaar.dokos.api.service.PlayerService
import de.os.dehaar.dokos.api.service.RoundService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/rounds")
class RoundController(
    var roundService: RoundService,
    var playerService: PlayerService) {

    @GetMapping("/rounds/{roundId}")
    fun get(@RequestParam roundId: Long): ResponseEntity<Round> {
        return ResponseEntity.ok(roundService.getById(roundId))
    }

    @PostMapping("/create")
    fun create(@RequestParam location: String): ResponseEntity<Round> {
        return ResponseEntity.ok(roundService.create(location))
    }

    @GetMapping("/all")
    fun all(): ResponseEntity<List<Round>> {
        return ResponseEntity.ok(
            roundService.all()
        )
    }

    @PostMapping("/addPlayer")
    fun addPlayer(@RequestParam roundId: Long, @RequestParam playerId: UUID): ResponseEntity<Round> {
        val added: Player? = playerService.getById(playerId)
        return if (added != null) {
            ResponseEntity.ok(
                roundService.addPlayer(roundId, added)
            )
        } else {
            throw RuntimeException("Player not found")
        }
    }
}