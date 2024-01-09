package epsi.software.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import epsi.software.sakila.entities.Country;
public interface CountryRepository extends JpaRepository<Country, Long> {
}
