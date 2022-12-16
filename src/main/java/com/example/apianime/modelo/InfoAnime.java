package com.example.apianime.modelo;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="info_anime")
public class InfoAnime {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="genero")
    private String genero;

    @Column(name="lanzamiento")
    private int lanzamiento;

    @Column(name="estudio")
    private String estudio;
}
