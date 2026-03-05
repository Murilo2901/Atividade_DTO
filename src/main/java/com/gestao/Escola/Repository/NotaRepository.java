package com.gestao.Escola.Repository;


import com.gestao.Escola.DTO.Response.NotaResponseDTO;
import com.gestao.Escola.Util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class NotaRepository {

    public List<NotaResponseDTO> listarNotasPorAluno(Long alunoId) throws SQLException {

        Connection conn = Conexao.conectar();

        String sql = """
        SELECT n.id, a.nome AS aluno_nome, au.assunto, n.valor
        FROM nota n
        JOIN aluno a ON n.aluno_id = a.id
        JOIN aula au ON n.aula_id = au.id
        WHERE a.id = ?
        """;

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setLong(1, alunoId);

        ResultSet rs = stmt.executeQuery();

        List<NotaResponseDTO> lista = new ArrayList<>();

        while (rs.next()) {

            NotaResponseDTO dto = new NotaResponseDTO();

            dto.setId(rs.getLong("id"));
            dto.setAlunoNome(rs.getString("aluno_nome"));
            dto.setAulaAssunto(rs.getString("assunto"));
            dto.setValor(rs.getDouble("valor"));

            lista.add(dto);
        }

        return lista;
    }

}