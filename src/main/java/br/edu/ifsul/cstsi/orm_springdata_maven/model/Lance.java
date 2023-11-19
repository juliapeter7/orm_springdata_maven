package br.edu.ifsul.cstsi.orm_springdata_maven.model;

import jakarta.persistence.*;

import java.sql.Time;

@Entity (name = "Lance")
@Table(name = "lances")
public class Lance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double val_lance;
    private Time hora_lance;
    //relacao lance-participante
    @ManyToOne
    @JoinColumn(name = "participante_id", referencedColumnName = "id")
    private Participante participante;

    // relacao lance-item_leilao
    @ManyToOne
    @JoinColumn(name = "item_leilao_id", referencedColumnName = "id")
    private Item_Leilao itemLeilao;

    //----

    public int regLance(double val_lance, Time hora_lance){
        System.out.println("Lance registrado!");
        return 0;
    }




    //----


    public Lance() {
    }

    public Lance(Long id, double val_lance, Time hora_lance, Participante participante, Item_Leilao itemLeilao) {
        this.id = id;
        this.val_lance = val_lance;
        this.hora_lance = hora_lance;
        this.participante = participante;
        this.itemLeilao = itemLeilao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getVal_lance() {
        return val_lance;
    }

    public void setVal_lance(double val_lance) {
        this.val_lance = val_lance;
    }

    public Time getHora_lance() {
        return hora_lance;
    }

    public void setHora_lance(Time hora_lance) {
        this.hora_lance = hora_lance;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Item_Leilao getItemLeilao() {
        return itemLeilao;
    }

    public void setItemLeilao(Item_Leilao itemLeilao) {
        this.itemLeilao = itemLeilao;
    }

    @Override
    public String toString() {
        return "Lance{" +
                "id=" + id +
                ", val_lance=" + val_lance +
                ", hora_lance=" + hora_lance +
                ", participante=" + participante +
                ", itemLeilao=" + itemLeilao +
                '}';
    }
}