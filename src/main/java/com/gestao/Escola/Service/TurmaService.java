package com.gestao.Escola.Service;


import com.gestao.Escola.DTO.Response.TurmaResponseDTO;
import com.gestao.Escola.Model.Turma;
import com.gestao.Escola.Repository.TurmaRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TurmaService {

    private TurmaRepository repository = new TurmaRepository();

    public List<TurmaResponseDTO> listar() throws SQLException {

        List<Turma> turmas = repository.listar();

        List<TurmaResponseDTO> resposta = new ArrayList<>();

        for (Turma t : turmas) {

            TurmaResponseDTO dto = new TurmaResponseDTO();

            dto.setId(t.getId());
            dto.setNome(t.getNome());

            resposta.add(dto);
        }

        return resposta;
    }

}