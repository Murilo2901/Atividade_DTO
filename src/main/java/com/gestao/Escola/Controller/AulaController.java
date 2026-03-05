package com.gestao.Escola.Controller;

import com.gestao.Escola.DTO.Response.AulaResponseDTO;
import com.gestao.Escola.Service.AulaService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/aulas")
public class AulaController {

    private AulaService service = new AulaService();

    @GetMapping
    public List<AulaResponseDTO> listar() throws SQLException {

        return service.listar();

    }

}