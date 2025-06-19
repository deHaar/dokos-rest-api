package de.os.dehaar.dokos.api.entity

import de.os.dehaar.dokos.api.entity.util.Team
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.dialect.PostgreSQLEnumJdbcType

@Entity
class Game @JvmOverloads constructor(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    val mixer: Player,

    val value: Int,

    @Enumerated(EnumType.STRING)
    @Column(name = "team")
    val winnerTeam: Team,

    val forehand: GameParticipation,

    val secondHand: GameParticipation,

    val thirdHand: GameParticipation,

    val backhand: GameParticipation
)