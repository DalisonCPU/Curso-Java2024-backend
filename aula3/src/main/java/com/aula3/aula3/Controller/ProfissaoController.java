package com.aula3.aula3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula3.aula3.Model.Profissao;
import com.aula3.aula3.service.ProfissaoService;

@RestController
@RequestMapping("/profissoes")
public class ProfissaoController {
    @Autowired
    private ProfissaoService profissaoService;

    @GetMapping
    public List<Profissao> getAllProfissoes() {
        return profissaoService.getAllProfissoes();
    }

    @PostMapping
    public Profissao createProfissao(@RequestBody Profissao profissao) {
        return profissaoService.saveProfissao(profissao);
    }
}