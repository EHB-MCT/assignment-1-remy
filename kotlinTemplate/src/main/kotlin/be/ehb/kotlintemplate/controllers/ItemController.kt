package be.ehb.kotlintemplate.controllers

import be.ehb.kotlintemplate.dto.ItemResponse
import be.ehb.kotlintemplate.models.Item
import be.ehb.kotlintemplate.services.ItemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("index")
class ItemController {
    @Autowired
    lateinit var itemService: ItemService

    @GetMapping("")
    fun index(): List<Item> {
        return itemService.index()
    }
}