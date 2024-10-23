package com.daniel.silva.categoria_de_memes.controller;


import com.daniel.silva.categoria_de_memes.entity.Categoria;
import com.daniel.silva.categoria_de_memes.service.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private  final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<Categoria> newMeme(@RequestBody Categoria meme){
        return ResponseEntity.status(201).body(service.newCategoria(meme));
    }

    @GetMapping
    public ResponseEntity<List<Categoria>>getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }











}
