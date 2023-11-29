package br.edu.ifsul.cstsi.orm_springdata_maven.model.participante;

import br.edu.ifsul.cstsi.orm_springdata_maven.endereco.Endereco;
import br.edu.ifsul.cstsi.orm_springdata_maven.lance.Lance;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Participante")
@Table(name = "participantes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Participante {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private String telefone;
    //relacao participante-lance
    @OneToMany(mappedBy = "participante")
    private List<Lance> lances;
    @Embedded
    private Endereco endereco;

    // ----
    public int login (String login, String senha){
        System.out.println("Login concluido com sucesso!");
        return 0;
    }

    public int regPar (String nome, String login, String senha, String email, Endereco endereco, String telefone){
        System.out.println("Participante registrado com sucesso!");
        return 0;
    }
}