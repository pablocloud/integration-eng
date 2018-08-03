package es.pabloverdugo.integrationengine.flights.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Availability implements Serializable {

    @Id
    @GeneratedValue
    Long id

    Double price
    Country countryFrom
    Country countryTo
    List<Flight> route

}
