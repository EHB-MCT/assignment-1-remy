package be.ehb.kotlintemplate.services

import be.ehb.kotlintemplate.models.Item
import be.ehb.kotlintemplate.repositories.ItemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ItemService {
    @Autowired
    lateinit var itemRepository: ItemRepository

    fun index(): List<Item>{
        return itemRepository.findAll()
    }
}