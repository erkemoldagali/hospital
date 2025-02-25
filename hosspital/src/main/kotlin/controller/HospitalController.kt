package org.example.controller

import com.example.hospitalmanagement.model.Patient
import com.example.hospitalmanagement.service.PatientService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/patients")
class PatientController(private val patientService: PatientService) {

    @GetMapping
    fun getAllPatients(): List<Patient> = patientService.getAllPatients()

    @PostMapping
    fun addPatient(@RequestBody patient: Patient): Patient = patientService.addPatient(patient)
}
