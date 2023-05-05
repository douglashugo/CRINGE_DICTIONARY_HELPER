package br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.model.Palavra;
import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.services.PalavraService;

@Controller
@RequestMapping("/dicionario")
public class PalavraController {

    @Autowired
    private PalavraService service;
    
    @GetMapping
    public String home() {
        System.out.println("Passou pelo PalavraController!");
        List<Palavra> palavras = service.obterTodas();
        palavras.forEach(p -> {
            System.out.println("Palavra: "+p.getPalavra());
            System.out.println("Significado: "+p.getSignificado());
            System.out.println("\n---------------------\n");
        });
        return "dicionario";
    }
}
