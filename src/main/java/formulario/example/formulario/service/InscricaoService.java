package formulario.example.formulario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import formulario.example.formulario.entity.Atividade;
import formulario.example.formulario.entity.Inscrito;
import formulario.example.formulario.repository.InscricaoRepository;

@Service
public class InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    public void processInscricao(Inscrito inscrito) {
        // Validar os dados da atividade
        validateInscrito(inscrito);

        Atividade atividade = inscrito.getAtividade();
        if (atividade.getInscricoes() >= atividade.getVagasDisponiveis()) {
            throw new RuntimeException("No vacancies available for this activity");
        }

        // Verificar disponibilidade de vagas
        if (inscrito.getInscricoes() >= inscrito.getVagasDisponiveis()) {
            throw new RuntimeException("As vagas para esta atividade já foram esgotadas.");
        }

        // Salvar a atividade (se necessário)
        inscrito = inscricaoRepository.save(inscrito);

        // Atualizar o número de inscrições da atividade CÓDIGO 331
        inscrito.setInscricoes(inscrito.getInscricoes() + 1);
    }

    private void validateAtividade(Atividade atividade) {
        // ... (restante das validações)
    }

    private boolean validateInscrito(Inscrito inscrito) {
        return true;
    }
}
