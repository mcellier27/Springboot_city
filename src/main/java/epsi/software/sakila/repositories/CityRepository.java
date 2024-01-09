package epsi.software.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import epsi.software.sakila.entities.City;
public interface CityRepository extends JpaRepository<City, Long> {
}
