package formulario.example.formulario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import formulario.example.formulario.entity.Atividade;
import formulario.example.formulario.entity.Inscrito;
import formulario.example.formulario.repository.AtividadeRepository;
import formulario.example.formulario.repository.InscritoRepository;


@Service
public class InscricaoService {
    
    @Autowired
    private InscritoRepository inscritoRepository;
    
    @Autowired
    private AtividadeRepository atividadeRepository;

    public Inscrito createInscricao(Inscrito inscrito, Long atividadeId) {
        // Obter a atividade usando o ID
        Atividade atividade = atividadeRepository.findById(atividadeId)
            .orElseThrow(() -> new RuntimeException("Atividade não encontrada"));

        // Validar os dados da atividade e do inscrito
        validateInscrito(inscrito);
        validateAtividade(atividade);

        // Verificar disponibilidade de vagas
        int numeroInscritos = atividade.getInscritos().size();
        if (numeroInscritos >= atividade.getVagasDisponiveis()) {
            throw new RuntimeException("As vagas para esta atividade já foram esgotadas.");
        }

        
        

        // Atualizar o número de inscrições da atividade
        atividade.setInscritos(atividade.getInscritos());
        atividadeRepository.save(atividade);

        return inscritoRepository.save(inscrito);
    }

    private void validateAtividade(Atividade atividade) {
        // Implementar validações necessárias para a atividade
    }

    private boolean validateInscrito(Inscrito inscrito) {
    // Validate id (should not be null, but since it's generated, we don't need to check)
    
    // Validate nome (should not be null or empty)
    if (inscrito.getNome() == null || inscrito.getNome().trim().isEmpty()) {
        throw new RuntimeException("Nome não pode ficar vazio");
    }
    
    // Validate email (should not be null or empty, and should be a valid email)
    if (inscrito.getEmail() == null || inscrito.getEmail().trim().isEmpty()) {
        throw new RuntimeException("Email não pode ficar vazio");
    }
    if (!isValidEmail(inscrito.getEmail())) {
        throw new RuntimeException("Formato de email inválido");
    }
    
    // Validate atividade (should not be null)
    if (inscrito.getAtividade() == null) {
        throw new RuntimeException("Atividade não pode ficar vazia");
    }
    
    return true;
}

private boolean isValidEmail(String email) {
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                        "[a-zA-Z0-9_+&*-]+)*@" +
                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                        "A-Z]{2,7}$";
    return email.matches(emailRegex);
}
    
}
