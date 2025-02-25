package org.example.model


import jakarta.persistence.*

@Entity
@Table(name = "patients")
data class Patient(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val age: Int
)