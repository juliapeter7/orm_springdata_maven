package br.edu.ifsul.cstsi.orm_springdata_maven.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Item_leilao")
@Table(name = "itens_leilao")
public class Item_Leilao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo_item;
    private String descricao_item;
    private double lance_minimo;
    private String caminho_foto;
    private int arrematado;

    //relacao item_leilao-lance
    @OneToMany(mappedBy = "itemLeilao")
    private List<Lance> lances;

    //relacao item-leilao
    @ManyToOne
    @JoinColumn(name = "leilao_id", referencedColumnName = "id")
    private Leilao leilao;

    // ----

    public int arrematarItem(){
        System.out.println("Item arrematado");
        return 0;
    }


    // ----


    public Item_Leilao() {
    }

    public Item_Leilao(Long id, String titulo_item, String descricao_item, double lance_minimo, String caminho_foto, int arrematado, List<Lance> lances, Leilao leilao) {
        this.id = id;
        this.titulo_item = titulo_item;
        this.descricao_item = descricao_item;
        this.lance_minimo = lance_minimo;
        this.caminho_foto = caminho_foto;
        this.arrematado = arrematado;
        this.lances = lances;
        this.leilao = leilao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo_item() {
        return titulo_item;
    }

    public void setTitulo_item(String titulo_item) {
        this.titulo_item = titulo_item;
    }

    public String getDescricao_item() {
        return descricao_item;
    }

    public void setDescricao_item(String descricao_item) {
        this.descricao_item = descricao_item;
    }

    public double getLance_minimo() {
        return lance_minimo;
    }

    public void setLance_minimo(double lance_minimo) {
        this.lance_minimo = lance_minimo;
    }

    public String getCaminho_foto() {
        return caminho_foto;
    }

    public void setCaminho_foto(String caminho_foto) {
        this.caminho_foto = caminho_foto;
    }

    public int getArrematado() {
        return arrematado;
    }

    public void setArrematado(int arrematado) {
        this.arrematado = arrematado;
    }

    public List<Lance> getLances() {
        return lances;
    }

    public void setLances(List<Lance> lances) {
        this.lances = lances;
    }

    public Leilao getLeilao() {
        return leilao;
    }

    public void setLeilao(Leilao leilao) {
        this.leilao = leilao;
    }

    @Override
    public String toString() {
        return "Item_Leilao{" +
                "id=" + id +
                ", titulo_item='" + titulo_item + '\'' +
                ", descricao_item='" + descricao_item + '\'' +
                ", lance_minimo=" + lance_minimo +
                ", caminho_foto='" + caminho_foto + '\'' +
                ", arrematado=" + arrematado +
                ", lances=" + lances +
                ", leilao=" + leilao +
                '}';
    }
}