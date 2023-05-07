package com.example.vodapp.model.entity;

import com.example.vodapp.model.Season;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Serial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    @Embedded
    private Season seasons;
    private Integer releaseYear;
}
