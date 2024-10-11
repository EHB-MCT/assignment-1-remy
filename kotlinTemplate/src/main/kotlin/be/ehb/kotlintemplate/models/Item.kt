package be.ehb.kotlintemplate.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Item {
    @Id @GeneratedValue var id:Long = -1
}