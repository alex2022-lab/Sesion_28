package com.example.db_evaluacion.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity

@Table(name = "characters")
public class Characters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status", length = 8)
    private String status;

    @Column(name = "created", length = 45)
    private String created;

    @Column(name = "gender", length = 45)
    private String gender;

    @Column(name = "species", length = 45)
    private String species;

    @Column(name = "img", length = 100)
    private String img;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "url", length = 100)
    private String url;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(mappedBy = "episodes")
    private List<Episode> episodes;
}
