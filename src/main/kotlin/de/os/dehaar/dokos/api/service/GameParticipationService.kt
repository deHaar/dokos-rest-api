package de.os.dehaar.dokos.api.service

import de.os.dehaar.dokos.api.entity.GameParticipation
import de.os.dehaar.dokos.api.entity.Player
import de.os.dehaar.dokos.api.entity.util.Team
import de.os.dehaar.dokos.api.repository.GameParticipationRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping

@Service
class GameParticipationService(var gameParticipationRepository: GameParticipationRepository) {

    fun add(player: Player, team: Team, pointsEarned: Int): GameParticipation {
        return gameParticipationRepository.save(GameParticipation(null, player, team, pointsEarned) )
    }
}