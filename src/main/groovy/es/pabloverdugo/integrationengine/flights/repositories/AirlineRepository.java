package es.pabloverdugo.integrationengine.flights.repositories;

import es.pabloverdugo.integrationengine.flights.domain.Airline;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {

    Page<Airline> findAllByNameContains(String name, Pageable pageable);

}
