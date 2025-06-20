package de.os.dehaar.dokos.api.service

import de.os.dehaar.dokos.api.entity.Player
import de.os.dehaar.dokos.api.repository.PlayerRepository
import org.springframework.stereotype.Service
import java.util.Optional
import java.util.UUID

@Service
class PlayerService(var playerRepository: PlayerRepository) {

    fun getAll(): List<Player> { return playerRepository.findAll() }

    fun getById(playerId: UUID): Player? { return playerRepository.findById(playerId).get() }

    fun add(displayName: String, email: String): Player {
        return playerRepository.save(Player(null, displayName, email))
    }

    fun deleteById(playerId: UUID) { playerRepository.deleteById(playerId) }
}