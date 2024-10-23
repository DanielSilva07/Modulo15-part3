package com.daniel.silva.categoria_de_memes.service;

import com.daniel.silva.categoria_de_memes.entity.Categoria;
import com.daniel.silva.categoria_de_memes.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }


    public Categoria newCategoria(Categoria categoria){
        return repository.save(categoria);
    }


    public List<Categoria> getAll(){
        return repository.findAll();
    }











}
