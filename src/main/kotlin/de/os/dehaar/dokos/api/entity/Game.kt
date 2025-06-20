package de.os.dehaar.dokos.api.entity

import de.os.dehaar.dokos.api.entity.util.Team
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToOne
import org.hibernate.annotations.CreationTimestamp
import java.time.Instant

@Entity
class Game @JvmOverloads constructor(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_round_id")
    val round: Round,

    @OneToOne
    @JoinColumn(name = "fk_player_id", referencedColumnName = "id")
    val mixer: Player,

    val value: Int,

    @Enumerated(EnumType.STRING)
    @Column(name = "team")
    val winnerTeam: Team,

    // TODO implement constraint: forehand, secondHand, thirdHand and backhand must be distinct players
    @OneToOne
    @JoinColumn(name = "fk_forehand_id", referencedColumnName = "id")
    val forehand: GameParticipation,

    @OneToOne
    @JoinColumn(name = "fk_secondhand_id", referencedColumnName = "id")
    val secondHand: GameParticipation,

    @OneToOne
    @JoinColumn(name = "fk_thirdhand_id", referencedColumnName = "id")
    val thirdHand: GameParticipation,

    @OneToOne
    @JoinColumn(name = "fk_backhand_id", referencedColumnName = "id")
    val backhand: GameParticipation,

    @CreationTimestamp
    val createdAt: Instant = Instant.now()
)