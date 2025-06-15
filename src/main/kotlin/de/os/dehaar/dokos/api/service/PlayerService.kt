package de.os.dehaar.dokos.api.service

import de.os.dehaar.dokos.api.entity.Player
import de.os.dehaar.dokos.api.repository.PlayerRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class PlayerService(var playerRepository: PlayerRepository) {

    fun getAll(): List<Player> { return playerRepository.findAll()}

    fun getById(playerId: Long): Optional<Player> { return playerRepository.findById(playerId) }

    fun add(nick: String, email: String): Player { return playerRepository.save(Player(nick, email)) }

    fun deleteById(playerId: Long) { playerRepository.deleteById(playerId) }
}