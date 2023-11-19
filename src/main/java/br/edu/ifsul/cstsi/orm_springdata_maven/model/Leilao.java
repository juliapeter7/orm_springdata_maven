package br.edu.ifsul.cstsi.orm_springdata_maven.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity(name = "Leilao")
@Table(name = "leilao")
public class Leilao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dt_inicio;
    private Time hor_inicio;
    private Date dt_final;
    private Time hor_final;

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

    public Leilao(Long id, Date dt_inicio, Time hor_inicio, Date dt_final, Time hor_final, List<Item_Leilao> itens_leilao) {
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

    public Date getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(Date dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public Time getHor_inicio() {
        return hor_inicio;
    }

    public void setHor_inicio(Time hor_inicio) {
        this.hor_inicio = hor_inicio;
    }

    public Date getDt_final() {
        return dt_final;
    }

    public void setDt_final(Date dt_final) {
        this.dt_final = dt_final;
    }

    public Time getHor_final() {
        return hor_final;
    }

    public void setHor_final(Time hor_final) {
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