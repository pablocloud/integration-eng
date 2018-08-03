package es.pabloverdugo.integrationengine.flights.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Country implements Serializable {

    @Id
    @GeneratedValue
    Long id

    String code
    String name

}
