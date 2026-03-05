package com.gestao.Escola.Service;


import com.gestao.Escola.DTO.Response.ProfessorResponseDTO;
import com.gestao.Escola.Model.Professor;
import com.gestao.Escola.Repository.ProfessorRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorService {

    private ProfessorRepository repository = new ProfessorRepository();

    public List<ProfessorResponseDTO> listar() throws SQLException {

        List<Professor> professores = repository.listar();

        List<ProfessorResponseDTO> resposta = new ArrayList<>();

        for (Professor p : professores) {

            ProfessorResponseDTO dto = new ProfessorResponseDTO();

            dto.setId(p.getId());
            dto.setNome(p.getNome());
            dto.setEmail(p.getEmail());
            dto.setDisciplina(p.getDisciplina());

            resposta.add(dto);
        }

        return resposta;
    }

}