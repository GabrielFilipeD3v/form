package formulario.example.formulario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import formulario.example.formulario.model.Atividade;
import formulario.example.formulario.service.AtividadeService;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @PostMapping
    public ResponseEntity<Atividade> criarAtividade(@RequestBody Atividade atividade) {
        try {
            atividadeService.processAtividade(atividade);
            return ResponseEntity.status(HttpStatus.CREATED).body(atividade);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }


}
