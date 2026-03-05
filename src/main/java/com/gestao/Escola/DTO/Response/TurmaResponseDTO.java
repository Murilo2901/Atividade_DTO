package com.gestao.Escola.DTO.Response;

import java.util.List;

public class TurmaResponseDTO {

    private Long id;
    private String nome;
    private String nomeCurso;
    private String nomeProfessor;
    private List<String> listaAlunos;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getNomeCurso() { return nomeCurso; }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeProfessor() { return nomeProfessor; }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public List<String> getListaAlunos() { return listaAlunos; }

    public void setListaAlunos(List<String> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

}