package com.gestao.Escola.Repository;

import com.gestao.Escola.Model.Aula;
import com.gestao.Escola.Util.Conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AulaRepository {

    public List<Aula> listar() throws SQLException {

        Connection conn = Conexao.conectar();

        String sql = "SELECT * FROM aula";

        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        List<Aula> aulas = new ArrayList<>();

        while (rs.next()) {

            Aula aula = new Aula();

            aula.setId(rs.getLong("id"));
            aula.setTurmaId(rs.getLong("turma_id"));
            aula.setDataHora(rs.getTimestamp("data_hora").toLocalDateTime());
            aula.setAssunto(rs.getString("assunto"));

            aulas.add(aula);
        }

        return aulas;
    }

}