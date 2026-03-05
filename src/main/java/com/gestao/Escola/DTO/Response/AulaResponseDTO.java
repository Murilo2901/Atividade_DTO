package com.gestao.Escola.DTO.Response;

import java.time.LocalDateTime;

public class AulaResponseDTO {

    private Long id;
    private String nomeTurma;
    private LocalDateTime dataHora;
    private String assunto;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNomeTurma() { return nomeTurma; }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public LocalDateTime getDataHora() { return dataHora; }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getAssunto() { return assunto; }

    public void setAssunto(String assunto) { this.assunto = assunto; }

}