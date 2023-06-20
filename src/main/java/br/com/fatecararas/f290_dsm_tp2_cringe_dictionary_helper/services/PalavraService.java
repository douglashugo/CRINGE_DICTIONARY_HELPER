package br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.model.Palavra;
import br.com.fatecararas.f290_dsm_tp2_cringe_dictionary_helper.repositories.PalavraRepository;

@Service
public class PalavraService {

    @Autowired
    private PalavraRepository repository;

    public void adicionar(Palavra palavra) {
        repository.save(palavra);
    }

    public List<Palavra> obterTodas() {
        return repository.findAll();
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }

    public Palavra buscarPorId(Integer id) {
        Optional<Palavra> palavra = repository.findById(id);
        if (palavra.isEmpty()) {
            throw new RuntimeException("Palavra não localizada. ID: " + id);
        }
        return palavra.get();
    }
}