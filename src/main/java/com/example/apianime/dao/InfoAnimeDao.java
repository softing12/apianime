package com.example.apianime.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apianime.modelo.InfoAnime;

public interface InfoAnimeDao extends JpaRepository<InfoAnime, Long>{
    
}
