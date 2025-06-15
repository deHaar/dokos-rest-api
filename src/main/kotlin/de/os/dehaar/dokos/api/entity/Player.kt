package de.os.dehaar.dokos.api.entity

import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

@Entity
class Player @JvmOverloads constructor(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,

    @NotBlank
    val displayName: String,

    @Email
    @NotBlank
    val email: String
)