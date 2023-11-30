package br.edu.ifsul.cstsi.orm_springdata_maven.item_leilao;

import br.edu.ifsul.cstsi.orm_springdata_maven.lance.Lance;
import br.edu.ifsul.cstsi.orm_springdata_maven.leilao.Leilao;
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
    private boolean arrematado;

    //relacao item_leilao-lance
    @OneToMany(mappedBy = "itemLeilao")
    private List<Lance> lances;

    //relacao item-leilao
    @ManyToOne
    @JoinColumn(name = "leilao_id", referencedColumnName = "id")
    private Leilao leilao;  // retirar

}