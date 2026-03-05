package com.gestao.Escola.Service;


import com.gestao.Escola.DTO.Response.NotaResponseDTO;
import com.gestao.Escola.Repository.NotaRepository;

import java.sql.SQLException;
import java.util.List;

public class NotaService {

    private NotaRepository repository = new NotaRepository();

    public List<NotaResponseDTO> buscarNotasAluno(Long alunoId) throws SQLException {
        return repository.listarNotasPorAluno(alunoId);
    }

}