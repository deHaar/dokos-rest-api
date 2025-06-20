package de.os.dehaar.dokos.api.entity

import de.os.dehaar.dokos.api.entity.util.Team
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne

@Entity
class GameParticipation (

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    // TODO implement constraint: Player has to be member of the round the game he participates is played in
    @OneToOne
    @JoinColumn(name = "fk_player_id", referencedColumnName = "id")
    val player: Player,

    val team: Team,

    val pointsEarned: Int
)