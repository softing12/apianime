package com.example.apianime.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.apianime.dao.InfoAnimeDao;
import com.example.apianime.modelo.InfoAnime;

@RestController
public class InfoAnimeControlador {
    
    @Autowired
    InfoAnimeDao infoAnimeDao;

    @PostMapping("/addAnime")
    public InfoAnime addAnime(@RequestBody InfoAnime anime){
        return infoAnimeDao.save(anime);
    }

    @GetMapping("/animes")
    public List<InfoAnime> getAnime(){
        return infoAnimeDao.findAll();
    }
    
    @PutMapping("/updateAnime")
    public InfoAnime updateAnime(@RequestBody InfoAnime anime){
        return infoAnimeDao.saveAndFlush(anime);
    }

    @DeleteMapping("/deleteAnime")
    public String deleteAnime(@RequestParam long id){
        infoAnimeDao.deleteById(id);
        return "El registro ha sido eliminado";
    }
    
}
