package com.gestao.Escola.DTO.Request;

import java.util.List;

public class TurmaRequestDTO {

    private String nome;
    private Long cursoId;
    private Long professorId;
    private List<Long> listaAlunoIds;

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Long getCursoId() { return cursoId; }

    public void setCursoId(Long cursoId) { this.cursoId = cursoId; }

    public Long getProfessorId() { return professorId; }

    public void setProfessorId(Long professorId) { this.professorId = professorId; }

    public List<Long> getListaAlunoIds() { return listaAlunoIds; }

    public void setListaAlunoIds(List<Long> listaAlunoIds) {
        this.listaAlunoIds = listaAlunoIds;
    }

}