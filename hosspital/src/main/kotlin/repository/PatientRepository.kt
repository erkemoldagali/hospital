package org.example.repository


import com.example.hospitalmanagement.model.Patient
import org.springframework.data.jpa.repository.JpaRepository

interface PatientRepository : JpaRepository<Patient, Long>
