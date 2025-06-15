package de.os.dehaar.dokos.api.repository

import de.os.dehaar.dokos.api.entity.Player
import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepository : JpaRepository<Player, Long> {}