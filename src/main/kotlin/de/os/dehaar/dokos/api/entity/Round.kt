package de.os.dehaar.dokos.api.entity

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToMany
import jakarta.persistence.OneToMany
import jakarta.validation.constraints.NotBlank
import org.hibernate.annotations.CreationTimestamp
import java.time.Instant

@Entity
class Round @JvmOverloads constructor(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @NotBlank
    val location: String,

    // TODO check how this goes!
    @ManyToMany(mappedBy = "round", fetch = FetchType.LAZY)
    val players: List<Player>,

    @OneToMany(mappedBy = "round", fetch = FetchType.LAZY)
    val games: List<Game>,

    @CreationTimestamp
    val createdAt: Instant = Instant.now()
)