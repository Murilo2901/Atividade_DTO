package com.gestao.Escola.DTO.Response;

public class NotaResponseDTO {

    private Long id;
    private String alunoNome;
    private String aulaAssunto;
    private Double valor;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getAlunoNome() { return alunoNome; }

    public void setAlunoNome(String alunoNome) {
        this.alunoNome = alunoNome;
    }

    public String getAulaAssunto() { return aulaAssunto; }

    public void setAulaAssunto(String aulaAssunto) {
        this.aulaAssunto = aulaAssunto;
    }

    public Double getValor() { return valor; }

    public void setValor(Double valor) { this.valor = valor; }

}