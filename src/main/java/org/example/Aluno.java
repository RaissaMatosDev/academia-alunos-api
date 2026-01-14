package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    private String nome;

    private int idade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Objetivo objetivo;

    public Aluno() {}

    public Aluno(String nome, int idade, Objetivo objetivo) {
        this.nome = nome;
        this.idade = idade;
        this.objetivo = objetivo;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public Objetivo getObjetivo() { return objetivo; }
}
