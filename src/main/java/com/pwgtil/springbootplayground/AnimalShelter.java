//package com.pwgtil.springbootplayground;
//
//import jakarta.persistence.*;
//import lombok.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.LinkedHashSet;
//import java.util.Set;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@ToString(exclude = "peopleInContact")
//@Entity
//class Animal {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String species;
//    private String name;
//    private Boolean ruinsFurniture;
//
//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinTable(
//            name = "animal_person",
//            joinColumns = @JoinColumn(name = "animal_id"),
//            inverseJoinColumns = @JoinColumn(name = "person_id"))
//    private Set<Person> peopleInContact = new LinkedHashSet<>();
//
//    public Animal(String species, String name, boolean ruinsFurniture) {
//        this.species = species;
//        this.name = name;
//        this.ruinsFurniture = ruinsFurniture;
//    }
//}
//
//@Getter
//@Setter
//@NoArgsConstructor
//@ToString(exclude = "animalsInContact")
//@Entity
//class Person {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//    private String name;
//    private int freeHours;
//
//    @ManyToMany(mappedBy = "peopleInContact")
//    private Set<Animal> animalsInContact = new LinkedHashSet<>();
//
//    public Person(String name, int freeHours) {
//        this.name = name;
//        this.freeHours = freeHours;
//    }
//}
//
//@Component
//class EntityService {
//
//    private EntityManager entityManager;
//
//    @Autowired
//    public EntityService(EntityManagerFactory entityManagerFactory) {
//        this.entityManager = entityManagerFactory.createEntityManager();
//    }
//
//    public void insertEntities() {
//        entityManager.getTransaction().begin();
//
//        Animal catLeo = new Animal("cat", "Leo", false);
//        Animal dogCharlie = new Animal("dog", "Charlie", true);
//        Animal dogBella = new Animal("dog", "Bella", false);
//
//        Person catLover1 = new Person("James", 8);
//        Person catLover2 = new Person("Mary", 6);
//        Person dogLover1 = new Person("John", 4);
//
//        catLeo.setPeopleInContact(Set.of(catLover1, catLover2));
//        dogCharlie.getPeopleInContact().add(dogLover1);
//        dogBella.getPeopleInContact().add(dogLover1);
//
//        catLover1.getAnimalsInContact().add(catLeo);
//        catLover2.getAnimalsInContact().add(catLeo);
//        dogLover1.setAnimalsInContact(Set.of(dogCharlie, dogBella));
//
//        entityManager.persist(catLeo);
//        entityManager.persist(dogCharlie);
//        entityManager.persist(dogBella);
//
//        entityManager.getTransaction().commit();
//        entityManager.clear();
//    }
//
//    public void addPersonToSet() {
//        entityManager.getTransaction().begin();
//
//        Animal foundAnimal = entityManager.find(Animal.class, 2L);
//        Person newDogLover = new Person("Emma", 5);
//
//        // INSERT INTO person VALUES("Emma", 5);
//        // INSERT INTO animal_person VALUES(2, 4)
//        foundAnimal.getPeopleInContact().add(newDogLover);
//
//        entityManager.getTransaction().commit();
//        entityManager.clear();
//    }
//
//    public void deletePersonFromSet() {
//        entityManager.getTransaction().begin();
//
//        Animal foundAnimal = entityManager.find(Animal.class, 1L);
//        Person firstPersonFromSet = foundAnimal.getPeopleInContact().iterator().next();
//
//        // DELETE FROM animal_person
//        // WHERE animal_id=1 and person_id=1
//        foundAnimal.getPeopleInContact().remove(firstPersonFromSet);
//
//        entityManager.getTransaction().commit();
//        entityManager.clear();
//    }
//
//    public void addAnimalToSet() {
//        entityManager.getTransaction().begin();
//
//        Person foundPerson = entityManager.find(Person.class, 3L);
//        Animal newDog = new Animal("dog", "Oscar", false);
//
//        //doesn't generate a query
//        foundPerson.getAnimalsInContact().add(newDog);
//
//        entityManager.getTransaction().commit();
//        entityManager.clear();
//    }
//
//    public void deleteAnimalFromSet() {
//        entityManager.getTransaction().begin();
//
//        Person foundPerson = entityManager.find(Person.class, 1L);
//        Animal firstAnimalFromSet = foundPerson.getAnimalsInContact().iterator().next();
//
//        //doesn't generate a query
//        foundPerson.getAnimalsInContact().remove(firstAnimalFromSet);
//
//        entityManager.getTransaction().commit();
//        entityManager.clear();
//    }
//}
//
//@Component
//class ShelterCommandLineRunner implements CommandLineRunner {
//
//    @Autowired
//    EntityService entityService;
//
//    @Override
//    public void run(String... args) {
//        entityService.insertEntities();
//        //other EntityService methods
//    }
//}
