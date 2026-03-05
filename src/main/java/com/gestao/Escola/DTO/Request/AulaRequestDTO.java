package com.gestao.Escola.DTO.Request;

import java.time.LocalDateTime;

public class AulaRequestDTO {

    private Long turmaId;
    private LocalDateTime dataHora;
    private String assunto;

    public Long getTurmaId() { return turmaId; }

    public void setTurmaId(Long turmaId) { this.turmaId = turmaId; }

    public LocalDateTime getDataHora() { return dataHora; }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getAssunto() { return assunto; }

    public void setAssunto(String assunto) { this.assunto = assunto; }

}