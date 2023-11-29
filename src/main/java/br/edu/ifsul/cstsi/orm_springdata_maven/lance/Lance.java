package br.edu.ifsul.cstsi.orm_springdata_maven.lance;

import br.edu.ifsul.cstsi.orm_springdata_maven.item_leilao.Item_Leilao;
import br.edu.ifsul.cstsi.orm_springdata_maven.model.participante.Participante;
import jakarta.persistence.*;

import java.time.LocalTime;

@Entity (name = "Lance")
@Table(name = "lances")
public class Lance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double val_lance;
    private LocalTime hora_lance;

    //relacao lance-participante
    @ManyToOne
    @JoinColumn(name = "participante_id", referencedColumnName = "id")
    private Participante participante;

    // relacao lance-item_leilao
    @ManyToOne
    @JoinColumn(name = "item_leilao_id", referencedColumnName = "id")
    private Item_Leilao itemLeilao;

}