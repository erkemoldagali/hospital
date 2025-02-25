package org.example.service

import com.example.hospitalmanagement.model.Patient
import com.example.hospitalmanagement.repository.PatientRepository
import org.springframework.stereotype.Service

@Service
class PatientService(private val patientRepository: PatientRepository) {

    fun getAllPatients(): List<Patient> = patientRepository.findAll()

    fun addPatient(patient: Patient): Patient = patientRepository.save(patient)
}
