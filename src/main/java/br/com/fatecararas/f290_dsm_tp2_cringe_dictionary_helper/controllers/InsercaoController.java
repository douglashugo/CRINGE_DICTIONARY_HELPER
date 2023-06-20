package br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.controllers;

import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.model.Palavra;
import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.services.PalavraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cadastro")
public class InsercaoController {

    @Autowired
    private PalavraService service;

    @GetMapping
    public String cadastro(Model model) {
        model.addAttribute("palavra", new Palavra());
        return "cadastro";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute("palavra") Palavra palavra) {
        System.out.println(palavra);
        service.adicionar(palavra);
        return "redirect:/dicionario";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Integer id,Model model) {
        Palavra palavra = service.buscarPorId(id);
        model.addAttribute("palavra", palavra);
        return "cadastro";
    }
}