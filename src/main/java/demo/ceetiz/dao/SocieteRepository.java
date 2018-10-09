package demo.ceetiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.ceetiz.model.Societe;

public interface SocieteRepository extends JpaRepository<Societe, String> {

}
