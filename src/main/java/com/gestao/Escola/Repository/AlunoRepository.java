package com.gestao.Escola.Repository;


import com.gestao.Escola.Model.Aluno;
import com.gestao.Escola.Util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {

    public List<Aluno> listar() throws SQLException {

        Connection conn = Conexao.conectar();

        String sql = "SELECT * FROM aluno";

        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        List<Aluno> alunos = new ArrayList<>();

        while (rs.next()) {

            Aluno aluno = new Aluno();

            aluno.setId(rs.getLong("id"));
            aluno.setNome(rs.getString("nome"));
            aluno.setEmail(rs.getString("email"));
            aluno.setMatricula(rs.getString("matricula"));

            alunos.add(aluno);
        }

        return alunos;
    }

}