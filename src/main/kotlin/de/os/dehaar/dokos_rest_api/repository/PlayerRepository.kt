package de.os.dehaar.dokos_rest_api.repository

import de.os.dehaar.dokos_rest_api.entity.Player
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PlayerRepository : JpaRepository<Player, Long> {}