package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.Contact;

public interface ContactDao extends JpaRepository<Contact, Long> {

}
