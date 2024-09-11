package formulario.example.formulario.model;

import java.time.LocalDate;

import java.time.LocalTime;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "Atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "atividade", nullable = false)
    private String atividade;
    @Column(name = "data", nullable = false)
    private LocalDate data;
    @Column(name = "horario", nullable = false)
    private LocalTime horario;
    @Column(name = "inscricoes", nullable = false)
    private int inscricoes;
    @Column(name = "vagasDisponiveis", nullable = false)
    private int vagasDisponiveis;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAtividade() {
        return atividade;
    }
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalTime getHorarios() {
        return horario;
    }
    public void setHorarios(LocalTime horario) {
        this.horario = horario;
    }

    public int getInscricoes() {
        return inscricoes;
    }
    public void setInscricoes(int inscricoes) {
        this.inscricoes = inscricoes;
    }
    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }
    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }


    

}
