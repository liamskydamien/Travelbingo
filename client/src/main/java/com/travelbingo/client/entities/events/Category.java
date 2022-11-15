package com.travelbingo.client.entities.events;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
