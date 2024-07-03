package com.example.prova2024.controller;

import com.example.prova2024.entity.Proprietario;
import com.example.prova2024.service.ProprietarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProprietarioController {
    @Autowired
    ProprietarioService proprietarioService;

    @PostMapping("proprietario")
    public String cadastrarTecnico(@RequestBody @Valid Proprietario proprietario) {
        proprietarioService.cadastrarProprietario(proprietario);
        return "Proprietário cadastrado com sucesso!";
    }

    @GetMapping("proprietarios/{id}")
    public List<Proprietario> buscarProprietarios() {
        return proprietarioService.buscarProprietarios();
    }

    @PutMapping("upproprietario/{id}")
    public String atualizarProprietario(@RequestBody @Valid Proprietario proprietario) {
        proprietarioService.atualizarProprietario(proprietario);
        return "Proprietário atualizado com sucesso!";
    }

    @DeleteMapping("deleteproprietario/{id}")
    public String deletarProprietario(@PathVariable Long id) {
        proprietarioService.deletarProprietario(id);
        return "Proprietário excluído com sucesso!";
    }
}
