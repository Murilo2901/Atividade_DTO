package com.gestao.Escola.Service;


import com.gestao.Escola.DTO.Response.CursoResponseDTO;
import com.gestao.Escola.Model.Curso;
import com.gestao.Escola.Repository.CursoRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoService {

    private CursoRepository repository = new CursoRepository();

    public List<CursoResponseDTO> listar() throws SQLException {

        List<Curso> cursos = repository.listar();

        List<CursoResponseDTO> resposta = new ArrayList<>();

        for (Curso c : cursos) {

            CursoResponseDTO dto = new CursoResponseDTO();

            dto.setId(c.getId());
            dto.setNome(c.getNome());
            dto.setCodigo(c.getCodigo());

            resposta.add(dto);
        }

        return resposta;
    }

}