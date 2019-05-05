package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.TypeDocument;

public interface TypeDocumentDao extends JpaRepository<TypeDocument, Long> {

}
