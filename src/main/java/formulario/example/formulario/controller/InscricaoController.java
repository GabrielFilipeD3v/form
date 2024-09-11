package formulario.example.formulario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formulario.example.formulario.model.Inscricao;
import formulario.example.formulario.service.InscricaoService;

@RestController
@RequestMapping("/inscricoes")
public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;

    @PostMapping
    public ResponseEntity<Inscricao> criarInscricao(@RequestBody Inscricao inscricao) {
        Inscricao novaInscricao = inscricaoService.salvarInscricao(inscricao);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaInscricao);
    }
}