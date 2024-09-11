package formulario.example.formulario.controller;

import org.springframework.ai.chat.client.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formulario.example.formulario.service.FormService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/forms")
public class FormController {
 
    @Autowired
    private FormService formService;
 
    // @PostMapping
    // public ResponseEntity<Form> submitForm(@RequestBody Form form) {
    //     formService.processForm(form);
    //     return ResponseEntity.ok(form);
    // }
}