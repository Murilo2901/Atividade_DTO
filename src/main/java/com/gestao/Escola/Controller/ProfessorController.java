package com.gestao.Escola.Controller;


import com.gestao.Escola.DTO.Response.ProfessorResponseDTO;
import com.gestao.Escola.Service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    private ProfessorService service = new ProfessorService();

    @GetMapping
    public List<ProfessorResponseDTO> listar() throws SQLException {
        return service.listar();
    }

}