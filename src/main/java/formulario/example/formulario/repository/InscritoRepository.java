package formulario.example.formulario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import formulario.example.formulario.entity.Inscrito;

@Repository
public interface InscritoRepository extends JpaRepository<Inscrito, Long> {

    List<Inscrito> findByAtividadeId(Long atividadeId);
}
