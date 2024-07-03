package com.example.prova2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min= 3, max=100, message = "O modelo precisa ter no mínimo 3 caracteres!")
    private String modelo;

    @Size(min= 2, max=100, message = "A marca precisa ter no mínimo 2 caracteres!")
    private String marca;

    @Min(1885)
    @Max(2024)
    private int ano;

    private String cor;

    @Min(1)
    private double preco;

    @Min(0)
    private double quilometragem;

    private LocalDate dataCadastro;

    @ManyToOne
    private Proprietario proprietario;

    private Tipo tipo;
}
