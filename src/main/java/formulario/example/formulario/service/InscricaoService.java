
package formulario.example.formulario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import formulario.example.formulario.model.Atividade;
import formulario.example.formulario.model.Inscricao;
import formulario.example.formulario.repository.InscricaoRepository;

@Service
public class InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;

     public void processInscricao(Inscricao inscricao) {
        // Validar os dados da atividade
        validateInscricao(inscricao);

        // Verificar disponibilidade de vagas
        if (inscricao.getInscricoes() >= inscricao.getVagasDisponiveis()) {
            throw new RuntimeException("As vagas para esta atividade já foram esgotadas.");
        }

        // Salvar a atividade (se necessário)
        inscricao = inscricaoRepository.save(inscricao);

        // Atualizar o número de inscrições da atividade CÓDIGO 331
        inscricao.setInscricoes(inscricao.getInscricoes() + 1);
    }

    private void validateAtividade(Atividade atividade) {
        // ... (restante das validações)
    }
}