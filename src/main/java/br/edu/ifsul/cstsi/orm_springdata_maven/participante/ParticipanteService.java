package br.edu.ifsul.cstsi.orm_springdata_maven.participante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ParticipanteService {
    @Autowired
    private ParticipanteRepository rep;

    public List<Participante> getParticipantes() {
        return rep.findAll();
    }


    public List<Participante> getParticipantesByNome(String nome) {
        return new ArrayList<>(rep.findByNome(nome + "%"));
    }

    public Participante insert(Participante participante) {
        Assert.isNull(participante.getId(),"Não foi possível inserir o registro");
        return rep.save(participante);
    }

    public Participante getParticipanteById(Long id) {
        Optional<Participante> optional = rep.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public Participante update(Participante participante) {
        Assert.notNull(participante.getId(),"Não foi possível atualizar o registro");

        // Busca o produto no banco de dados
        Optional<Participante> optional = rep.findById(participante.getId());
        if(optional.isPresent()) {
            Participante db = optional.get();
            // Copiar as propriedades
            db.setNome(participante.getNome());
            db.setLogin(participante.getLogin());
            db.setSenha(participante.getSenha());
            db.setEmail(participante.getEmail());
            db.setTelefone(participante.getTelefone());
            // Atualiza o produto
            rep.save(db);

            return db;
        } else {
            return null;
            //throw new RuntimeException("Não foi possível atualizar o registro");
        }
    }

    public void delete(Long id) {
        rep.deleteById(id);
    }
}