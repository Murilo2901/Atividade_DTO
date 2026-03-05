package com.gestao.Escola.Model;

import java.time.LocalDateTime;

public class Aula {

    private Long id;
    private Long turmaId;
    private LocalDateTime dataHora;
    private String assunto;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getTurmaId() { return turmaId; }

    public void setTurmaId(Long turmaId) { this.turmaId = turmaId; }

    public LocalDateTime getDataHora() { return dataHora; }

    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    public String getAssunto() { return assunto; }

    public void setAssunto(String assunto) { this.assunto = assunto; }

}