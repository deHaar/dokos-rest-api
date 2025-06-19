package de.os.dehaar.dokos.api.repository

import de.os.dehaar.dokos.api.entity.Game
import org.springframework.data.jpa.repository.JpaRepository

interface GameRepository : JpaRepository<Game, Long> {}