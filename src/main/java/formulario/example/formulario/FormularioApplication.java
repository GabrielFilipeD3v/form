package formulario.example.formulario;

import org.springframework.ai.autoconfigure.postgresml.PostgresMlAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = PostgresMlAutoConfiguration.class)
public class FormularioApplication {

    public static void main(String[] args) {
        SpringApplication.run(FormularioApplication.class, args);
    }

}
