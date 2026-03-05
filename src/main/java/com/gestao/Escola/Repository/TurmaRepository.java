package com.gestao.Escola.Repository;


import com.gestao.Escola.Model.Turma;
import com.gestao.Escola.Util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TurmaRepository {

    public List<Turma> listar() throws SQLException {

        Connection conn = Conexao.conectar();

        String sql = "SELECT * FROM turma";

        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        List<Turma> turmas = new ArrayList<>();

        while (rs.next()) {

            Turma t = new Turma();

            t.setId(rs.getLong("id"));
            t.setNome(rs.getString("nome"));
            t.setCursoId(rs.getLong("curso_id"));
            t.setProfessorId(rs.getLong("professor_id"));

            turmas.add(t);
        }

        return turmas;
    }

}