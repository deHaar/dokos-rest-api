package de.os.dehaar.dokos.api.controller

import de.os.dehaar.dokos.api.entity.Player
import de.os.dehaar.dokos.api.service.PlayerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/players")
class PlayerController(var playerService: PlayerService) {

    @GetMapping("/all")
    fun allPlayers(): ResponseEntity<List<Player>> {
        val players = playerService.getAll()
        return ResponseEntity.ok(players)
    }

    @PostMapping("/add")
    fun addPlayer(nick: String, email: String): ResponseEntity<Player> {
        val player = playerService.add(nick, email)
        return ResponseEntity.ok(player)
    }

    @GetMapping("/{playerId}")
    fun playerById(@RequestParam playerId: UUID): ResponseEntity<Player> {
        val player = playerService.getById(playerId)
        return if (player.isEmpty) {
            ResponseEntity.notFound().build()
        } else {
            ResponseEntity.ok(player.get())
        }
    }

    @PostMapping("/{playerId}/delete")
    fun deleteById(@RequestParam playerId: UUID): ResponseEntity<Player> {
        playerService.deleteById(playerId)
        return ResponseEntity.noContent().build()
    }
}