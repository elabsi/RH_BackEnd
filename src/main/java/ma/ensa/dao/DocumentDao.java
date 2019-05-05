package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Document;

public interface DocumentDao extends JpaRepository<Document, Long>{

}
