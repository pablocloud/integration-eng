package es.pabloverdugo.integrationengine.flights.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Airline implements Serializable {

    @Id
    @GeneratedValue
    Long id

    String iataCode
    String name
    String logo

}
