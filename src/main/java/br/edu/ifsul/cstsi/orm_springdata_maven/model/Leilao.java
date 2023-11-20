package br.edu.ifsul.cstsi.orm_springdata_maven.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity(name = "Leilao")
@Table(name = "leilao")
public class Leilao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dt_inicio;
    private LocalTime hor_inicio;
    private LocalDate dt_final;
    private LocalTime hor_final;

    //relacao leilao-itens
    @OneToMany(mappedBy = "leilao")
    private List<Item_Leilao> itens_leilao;

    // ----

    public int iniciaLeilao(){
        System.out.println("Leiao iniciado");
        return 0;
    }

    public int finalizaLeilao(){
        System.out.println("Leiao finalizado");
        return 0;
    }


    // ----

    public Leilao() {
    }

    public Leilao(Long id, LocalDate dt_inicio, LocalTime hor_inicio, LocalDate dt_final, LocalTime hor_final,
                  List<Item_Leilao> itens_leilao) {
        this.id = id;
        this.dt_inicio = dt_inicio;
        this.hor_inicio = hor_inicio;
        this.dt_final = dt_final;
        this.hor_final = hor_final;
        this.itens_leilao = itens_leilao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(LocalDate dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public LocalTime getHor_inicio() {
        return hor_inicio;
    }

    public void setHor_inicio(LocalTime hor_inicio) {
        this.hor_inicio = hor_inicio;
    }

    public LocalDate getDt_final() {
        return dt_final;
    }

    public void setDt_final(LocalDate dt_final) {
        this.dt_final = dt_final;
    }

    public LocalTime getHor_final() {
        return hor_final;
    }

    public void setHor_final(LocalTime hor_final) {
        this.hor_final = hor_final;
    }

    public List<Item_Leilao> getItens_leilao() {
        return itens_leilao;
    }

    public void setItens_leilao(List<Item_Leilao> itens_leilao) {
        this.itens_leilao = itens_leilao;
    }

    @Override
    public String toString() {
        return "Leilao{" +
                "id=" + id +
                ", dt_inicio=" + dt_inicio +
                ", hor_inicio=" + hor_inicio +
                ", dt_final=" + dt_final +
                ", hor_final=" + hor_final +
                ", itens_leilao=" + itens_leilao +
                '}';
    }
}