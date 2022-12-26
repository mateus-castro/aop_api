package com.kastro.aop_api.interfaces

import com.kastro.aop_api.models.Ritual
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface RitualRepository : MongoRepository<Ritual, String> {
//    fun findAllByElement(element: String): Optional<Ritual>
//    fun findRitualById(id: String): Optional<Ritual>
}