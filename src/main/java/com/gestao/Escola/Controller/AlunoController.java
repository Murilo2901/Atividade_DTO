package com.gestao.Escola.Controller;

import com.gestao.Escola.DTO.Response.AlunoResponseDTO;
import com.gestao.Escola.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private AlunoService service = new AlunoService();

    @GetMapping
    public List<AlunoResponseDTO> listar() throws SQLException {
        return service.listarAlunos();
    }

}