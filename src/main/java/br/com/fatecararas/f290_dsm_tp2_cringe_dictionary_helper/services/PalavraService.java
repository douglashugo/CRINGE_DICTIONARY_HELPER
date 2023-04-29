package br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.model.Palavra;
import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.repositories.PalavraRepository;

@Service
public class PalavraService {

    @Autowired
    private PalavraRepository repository;
    
    public List<Palavra> obterTodas() {
        return repository.findAll();
    }
}

// Valdelaine, Douglas, Witer, Luiza
// Leandro, Felipe, Mateus, Murilo, Klayvert, Fernando
//Luca, Luiz fernando, Danel Carolan, Gabriel, Carol, Ester, Vitor
//Taina, Bruno
