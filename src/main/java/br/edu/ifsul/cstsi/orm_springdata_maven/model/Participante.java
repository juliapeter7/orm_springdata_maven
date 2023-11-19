package br.edu.ifsul.cstsi.orm_springdata_maven.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Participante")
@Table(name = "participantes")
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



    // ----

    public Participante() {
    }

    public Participante(Long id, String nome, String login, String senha, String email, String telefone, List<Lance> lances, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
        this.lances = lances;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Lance> getLances() {
        return lances;
    }

    public void setLances(List<Lance> lances) {
        this.lances = lances;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", lances=" + lances +
                ", endereco=" + endereco +
                '}';
    }
}