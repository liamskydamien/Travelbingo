package com.travelbingo.client.entities.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "location_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_LOCATION_CODE"))
    private Location location;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "category_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_CATEGORY_CODE"))
    private Category category;

    @Column
    private String description;

}
