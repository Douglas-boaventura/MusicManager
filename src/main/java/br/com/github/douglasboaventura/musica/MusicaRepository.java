package br.com.github.douglasboaventura.musica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
/*
    Since most repository calls are for read operations, it is good practice
    to define at the class level that transactions are read-only.
    reference: https://vladmihalcea.com/spring-transaction-best-practices/
 */
public interface MusicaRepository extends JpaRepository<Musica, Long> {
}
