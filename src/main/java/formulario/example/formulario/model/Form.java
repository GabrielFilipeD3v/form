package formulario.example.formulario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Conta")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "form_id")
    private Long formID;

    @Column(name = "data", nullable = false, length = 4)
    private String data;

    @Column(name = "atividade", nullable = false, length = 10)
    private String atividade;
    
    @Column(name = "horarios", nullable = false, length = 10)
    private String horarios;

    @Column(name = "vagas", nullable = false, length = 10)
    private String vagas;



    public Long getformID() {
        return formID;
    }

    public void setformID(Long formID) {
        this.formID = formID;
    }

    public String getdata() {
        return data;
    }

    public void setdata(String data) {
        this.data = data;
    }

    public String getatividade() {
        return atividade;
    }

    public void setatividade(String atividade) {
        this.atividade = atividade;
    }

    public String gethorarios() {
        return horarios;
    }

    public void sethorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getvagas() {
        return vagas;
    }

    public void setvagas(String vagas) {
        this.vagas = vagas;
    }



}