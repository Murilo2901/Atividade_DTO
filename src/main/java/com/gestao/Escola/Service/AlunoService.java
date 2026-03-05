package com.gestao.Escola.Service;

import com.gestao.Escola.DTO.Response.AlunoResponseDTO;
import com.gestao.Escola.Model.Aluno;
import com.gestao.Escola.Repository.AlunoRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoService {

    private AlunoRepository repository = new AlunoRepository();

    public List<AlunoResponseDTO> listarAlunos() throws SQLException {

        List<Aluno> alunos = repository.listar();

        List<AlunoResponseDTO> resposta = new ArrayList<>();

        for (Aluno aluno : alunos) {

            AlunoResponseDTO dto = new AlunoResponseDTO();

            dto.setId(aluno.getId());
            dto.setNome(aluno.getNome());
            dto.setEmail(aluno.getEmail());
            dto.setMatricula(aluno.getMatricula());

            resposta.add(dto);
        }

        return resposta;
    }
}