package formulario.example.formulario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import formulario.example.formulario.entity.Atividade;
import formulario.example.formulario.repository.AtividadeRepository;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepository;

    public Atividade salvarAtividade(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

}
