package com.gestao.Escola.Repository;


import com.gestao.Escola.Model.Curso;
import com.gestao.Escola.Util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CursoRepository {

    public List<Curso> listar() throws SQLException {

        Connection conn = Conexao.conectar();

        String sql = "SELECT * FROM curso";

        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        List<Curso> cursos = new ArrayList<>();

        while (rs.next()) {

            Curso c = new Curso();

            c.setId(rs.getLong("id"));
            c.setNome(rs.getString("nome"));
            c.setCodigo(rs.getString("codigo"));

            cursos.add(c);
        }

        return cursos;
    }

}