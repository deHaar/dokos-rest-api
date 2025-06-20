package de.os.dehaar.dokos.api.service

import de.os.dehaar.dokos.api.entity.Game
import de.os.dehaar.dokos.api.entity.Player
import de.os.dehaar.dokos.api.entity.Round
import de.os.dehaar.dokos.api.repository.RoundRepository
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class RoundService(var roundRepository: RoundRepository) {

    fun getById(roundId: Long): Round {
        return roundRepository.findById(roundId).get()
    }

    fun all(): List<Round> {
        return roundRepository.findAll()
    }

    fun create(location: String): Round {
        return roundRepository.save<Round>(
            Round(
                null,
                location,
                mutableListOf<Player>(),
                mutableListOf<Game>()
            )
        )
    }

    fun addPlayer(roundId: Long, player: Player): Round {
        val round = roundRepository.findById(roundId).get()
        round.players.plus(player)
        return roundRepository.save<Round>(round)
    }

    fun addPlayers(roundId: Long, players: List<Player>): Round {
        val round = roundRepository.findById(roundId).get()
        round.players.plus(players)
        return roundRepository.save<Round>(round)
    }
}