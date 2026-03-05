package com.gestao.Escola.Model;

public class Turma {

    private Long id;
    private String nome;
    private Long cursoId;
    private Long professorId;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Long getCursoId() { return cursoId; }

    public void setCursoId(Long cursoId) { this.cursoId = cursoId; }

    public Long getProfessorId() { return professorId; }

    public void setProfessorId(Long professorId) { this.professorId = professorId; }

}
