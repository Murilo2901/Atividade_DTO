package com.gestao.Escola.DTO.Request;

public class NotaRequestDTO {

    private Long alunoId;
    private Long aulaId;
    private Double valor;

    public Long getAlunoId() { return alunoId; }

    public void setAlunoId(Long alunoId) { this.alunoId = alunoId; }

    public Long getAulaId() { return aulaId; }

    public void setAulaId(Long aulaId) { this.aulaId = aulaId; }

    public Double getValor() { return valor; }

    public void setValor(Double valor) { this.valor = valor; }

}