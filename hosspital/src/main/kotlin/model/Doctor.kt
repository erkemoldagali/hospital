package org.example.model

import jakarta.persistence.*

@Entity
@Table(name = "doctors")
data class Doctor(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val specialty: String
)
