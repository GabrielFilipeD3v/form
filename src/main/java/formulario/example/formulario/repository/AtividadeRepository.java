package formulario.example.formulario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import formulario.example.formulario.entity.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {

}
