package de.os.dehaar.dokos.api.repository

import de.os.dehaar.dokos.api.entity.Round
import org.springframework.data.jpa.repository.JpaRepository

interface RoundRepository : JpaRepository<Round, Long> {}