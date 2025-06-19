package de.os.dehaar.dokos.api.service

import de.os.dehaar.dokos.api.entity.Game
import de.os.dehaar.dokos.api.entity.Player
import de.os.dehaar.dokos.api.entity.Round
import de.os.dehaar.dokos.api.repository.RoundRepository
import org.springframework.stereotype.Service

@Service
class RoundService(var roundRepository: RoundRepository) {

    fun create(location: String): Round {
        return roundRepository.save<Round>(Round(null, location, mutableListOf<Player>(), mutableListOf<Game>()))
    }

    fun addPlayer(roundId: Long, player: Player): Round {
        val round = roundRepository.findById(roundId).get()
        round.players.plus(player)
        return roundRepository.save<Round>(round)
    }
}