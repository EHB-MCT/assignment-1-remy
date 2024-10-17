package be.ehb.kotlintemplate.repositories


import be.ehb.kotlintemplate.models.Item
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository: JpaRepository<Item, Long> {
}