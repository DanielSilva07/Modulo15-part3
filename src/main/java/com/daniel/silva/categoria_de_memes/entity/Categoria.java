package com.daniel.silva.categoria_de_memes.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table
public class Categoria {

    @Id
    private Long id;

    private String nome;

    private String descricao;

    private String dataDeCadastro;

}
