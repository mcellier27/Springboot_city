package epsi.software.sakila.services;

import epsi.software.sakila.entities.City;

import java.util.List;

/*Interface city crud
 *
 */

public interface CityService {
    City create(City city);
    City read(Long id);
    List<City>readAll();
    City delete(City city);
    City update(Long id);
}
