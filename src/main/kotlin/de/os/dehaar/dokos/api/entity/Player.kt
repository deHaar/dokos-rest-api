package de.os.dehaar.dokos.api.entity

import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

@Entity
class Player @JvmOverloads constructor(

    @NotBlank
    val nick: String,

    @Email
    @NotBlank
    val email: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

){}