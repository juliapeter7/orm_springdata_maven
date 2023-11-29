package br.edu.ifsul.cstsi.orm_springdata_maven.model.leilao;

import br.edu.ifsul.cstsi.orm_springdata_maven.model.item_leilao.Item_Leilao;
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

}