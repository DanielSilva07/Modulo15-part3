package com.daniel.silva.categoria_de_memes.repository;

import com.daniel.silva.categoria_de_memes.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria,Long> {
}
