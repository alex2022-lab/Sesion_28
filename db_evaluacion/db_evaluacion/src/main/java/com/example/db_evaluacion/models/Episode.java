package com.example.db_evaluacion.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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

@Table(name = "episode")
public class Episode {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "air_date", length = 45)
    private String air_date;

    @Column(name = "episode", length = 45)
    private String episode;

    @Column(name = "characters", length = 100)
    private String characters;

    @Column(name = "created", length = 100)
    private String created;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "url", length = 100)
    private String url;

    @ManyToMany
    @JoinTable(
        name = "characters_episodes",
        joinColumns = @JoinColumn(name = "character_id"),
        inverseJoinColumns = @JoinColumn(name = "episode_id")
    )
    private List<Characters> episodes;
}
