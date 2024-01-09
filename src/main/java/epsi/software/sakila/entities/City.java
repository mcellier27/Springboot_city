package epsi.software.sakila.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    private String city;
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @Override
    public String toString() {
        return "City{" +
                "Id=" + Id +
                ", city='" + city + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}