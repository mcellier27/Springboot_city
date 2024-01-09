package epsi.software.sakila.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
    @Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "country_id")
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

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    private String country;
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @Override
    public String toString() {
        return "Country{" +
                "Id=" + Id +
                ", country='" + country + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
