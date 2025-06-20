package de.os.dehaar.dokos.api.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import org.hibernate.annotations.CreationTimestamp
import java.time.Instant
import java.util.UUID

@Entity
class Player @JvmOverloads constructor(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,

    @NotBlank
    val displayName: String,

    @Email
    @NotBlank
    val email: String,

    @CreationTimestamp
    val createdAt: Instant = Instant.now()
)