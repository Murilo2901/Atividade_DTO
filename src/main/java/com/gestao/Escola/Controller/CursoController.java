package com.gestao.Escola.Controller;


import com.gestao.Escola.DTO.Response.CursoResponseDTO;
import com.gestao.Escola.Service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private CursoService service = new CursoService();

    @GetMapping
    public List<CursoResponseDTO> listar() throws SQLException {
        return service.listar();
    }

}