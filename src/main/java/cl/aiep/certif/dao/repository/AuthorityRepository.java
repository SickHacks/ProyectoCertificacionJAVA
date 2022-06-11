package cl.aiep.certif.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.aiep.certif.dao.entity.Authorities;

@Repository
public interface AuthorityRepository extends JpaRepository<Authorities, Integer> {

}
