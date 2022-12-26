package com.kastro.aop_api.controllers

import com.kastro.aop_api.interfaces.RitualRepository
import com.kastro.aop_api.models.Ritual
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("rituals")
class RitualController (private val repository: RitualRepository) {

    @PostMapping
    fun createRitual(@RequestBody ritual: Ritual): ResponseEntity<Ritual>{
//        val createRitual = repository.save(ritual)
//        return ResponseEntity.ok(createRitual)
        return ResponseEntity.status(201).build()
    }

    @GetMapping
    fun getAllRituals(): ResponseEntity<List<Ritual>>{
        val ritualFullList = repository.findAll()
        return ResponseEntity.ok(ritualFullList)
    }

//    @PutMapping("{id}")
//    fun updateRitual(@PathVariable id: String, @RequestBody ritual: Ritual): ResponseEntity<Ritual> {
//        val ritualToBeUpdated = repository.findRitualById(id).orElseThrow { RuntimeException("Ritual ID $id was not found") }
//        val updatedResponse = repository.save(ritualToBeUpdated.copy(name = ritual.name))
//        return ResponseEntity.ok(updatedResponse)
//    }
}