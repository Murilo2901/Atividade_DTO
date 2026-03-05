package com.gestao.Escola.Repository;

import com.gestao.Escola.Model.Professor;
import com.gestao.Escola.Util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorRepository {

    public List<Professor> listar() throws SQLException {

        Connection conn = Conexao.conectar();

        String sql = "SELECT * FROM professor";

        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        List<Professor> lista = new ArrayList<>();

        while (rs.next()) {

            Professor p = new Professor();

            p.setId(rs.getLong("id"));
            p.setNome(rs.getString("nome"));
            p.setEmail(rs.getString("email"));
            p.setDisciplina(rs.getString("disciplina"));

            lista.add(p);
        }

        return lista;
    }

}