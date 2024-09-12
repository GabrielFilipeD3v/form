package formulario.example.formulario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import formulario.example.formulario.entity.Atividade;
import formulario.example.formulario.service.AtividadeService;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @PostMapping
    public Atividade criarAtividade(@RequestBody Atividade atividade) {
        return atividadeService.salvarAtividade(atividade);
    }

}
