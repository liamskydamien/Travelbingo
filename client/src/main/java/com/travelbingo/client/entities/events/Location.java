package com.travelbingo.client.entities.events;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "country_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_COUNTRY_CODE"))
    private Country country;

    @Column
    private String coordinates;

    @Column
    private String description;

    @Column
    private String name;

    public Location(Country country, String name, String description, String coordinates) {
        this.country = country;
        this.coordinates = coordinates;
        this.description = description;
        this.name = name;
    }
}
