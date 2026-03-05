package com.gestao.Escola.Service;


import com.gestao.Escola.DTO.Response.AulaResponseDTO;
import com.gestao.Escola.Model.Aula;
import com.gestao.Escola.Repository.AulaRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AulaService {

    private AulaRepository repository = new AulaRepository();

    public List<AulaResponseDTO> listar() throws SQLException {

        List<Aula> aulas = repository.listar();

        List<AulaResponseDTO> resposta = new ArrayList<>();

        for (Aula aula : aulas) {

            AulaResponseDTO dto = new AulaResponseDTO();

            dto.setId(aula.getId());
            dto.setDataHora(aula.getDataHora());
            dto.setAssunto(aula.getAssunto());

            resposta.add(dto);
        }

        return resposta;
    }

}