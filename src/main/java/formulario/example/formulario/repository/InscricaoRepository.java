package formulario.example.formulario.repository;
import formulario.example.formulario.model.Inscricao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Long>{
    
}

