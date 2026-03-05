package com.gestao.Escola.Controller;


import com.gestao.Escola.DTO.Response.NotaResponseDTO;
import com.gestao.Escola.Service.NotaService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/notas")
public class NotaController {

    private NotaService service = new NotaService();

    @GetMapping("/aluno/{id}")
    public List<NotaResponseDTO> buscarNotas(@PathVariable Long id) throws SQLException {

        return service.buscarNotasAluno(id);

    }

}