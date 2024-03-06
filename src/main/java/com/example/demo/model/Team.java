package com.example.demo.model;
import javax.persistence.*;
import java.util.List;

public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "city")
    private String city;
    @Column(name = "foundation_year")
    private int foundationYear;
    @ManyToMany(mappedBy = "team")
    private List<Player> players;

    // Конструктори
    public Team() {
    }

    public Team(Long id, String name, String city, int foundationYear) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.foundationYear = foundationYear;
    }

    // Геттери та сеттери
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }
}
