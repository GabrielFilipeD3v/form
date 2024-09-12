package formulario.example.formulario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import formulario.example.formulario.entity.Inscrito;
import formulario.example.formulario.service.InscricaoService;

@RestController
@RequestMapping("/inscricoes")
public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;

    @PostMapping
    public Inscrito createInscricao(@RequestBody Inscrito inscrito) {

    return inscricaoService.createInscricao(inscrito, inscrito.getAtividade().getId());
    
    
    }
    
}
