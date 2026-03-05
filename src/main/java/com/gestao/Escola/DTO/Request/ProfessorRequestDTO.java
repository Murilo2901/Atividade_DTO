package com.gestao.Escola.DTO.Request;

public class ProfessorRequestDTO {

    private String nome;
    private String email;
    private String disciplina;

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getDisciplina() { return disciplina; }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}