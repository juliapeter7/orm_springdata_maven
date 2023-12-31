package br.edu.ifsul.cstsi.orm_springdata_maven.participante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ParticipanteRepository extends JpaRepository<Participante,Long> {
    @Query(value = "SELECT p FROM Participante p where p.nome like ?1")
    List<Participante> findByNome(String nome);
}
