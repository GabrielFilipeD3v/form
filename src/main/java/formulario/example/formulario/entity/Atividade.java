package formulario.example.formulario.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

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
    @Column(name = "vagas_disponiveis", nullable = false)
    private int vagasDisponiveis;
    @OneToMany(mappedBy = "atividade", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inscrito> inscritos;

    public Long getId() {
        return id;
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

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public List<Inscrito> getInscritos() {
        return inscritos;
    }

    public void setInscritos(List<Inscrito> inscritos) {
        this.inscritos = inscritos;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

}
