package com.pwgtil.springbootplayground;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "peopleInContact")
@Entity
class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String species;
    private String name;
    private Boolean ruinsFurniture;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "animal_person",
            joinColumns = @JoinColumn(name = "animal_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id"))
    private Set<Person> peopleInContact = new LinkedHashSet<>();

    public Animal(String species, String name, boolean ruinsFurniture) {
        this.species = species;
        this.name = name;
        this.ruinsFurniture = ruinsFurniture;
    }
}

@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "animalsInContact")
@Entity
class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int freeHours;

    @ManyToMany(mappedBy = "peopleInContact")
    private Set<Animal> animalsInContact = new LinkedHashSet<>();

    public Person(String name, int freeHours) {
        this.name = name;
        this.freeHours = freeHours;
    }
}
