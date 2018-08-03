package es.pabloverdugo.integrationengine.flights.repositories;

import es.pabloverdugo.integrationengine.flights.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface FlightRepository extends JpaRepository<Flight, Long> {

}
