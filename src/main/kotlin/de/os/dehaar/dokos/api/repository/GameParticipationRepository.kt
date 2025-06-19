package de.os.dehaar.dokos.api.repository

import de.os.dehaar.dokos.api.entity.GameParticipation
import org.springframework.data.jpa.repository.JpaRepository

interface GameParticipationRepository : JpaRepository<GameParticipation, Long> {}