package com.gestao.Escola.Controller;


import com.gestao.Escola.DTO.Response.TurmaResponseDTO;
import com.gestao.Escola.Service.TurmaService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


@RestController
@RequestMapping("/turmas")
public class TurmaController {

    private TurmaService service = new TurmaService();

    @GetMapping
    public List<TurmaResponseDTO> listar() throws SQLException {
        return service.listar();
    }

}