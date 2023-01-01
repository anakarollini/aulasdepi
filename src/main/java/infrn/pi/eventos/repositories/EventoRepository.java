package infrn.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import infrn.pi.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{

}
