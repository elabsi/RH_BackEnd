package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.CollaborateurDao;
import ma.ensa.dao.DocumentDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.entities.Document;
import ma.ensa.metiers.DocumentMetier;

@Service
public class DocumentMetierImpl implements DocumentMetier {
 
	@Autowired
	private CollaborateurDao collaborateurDao;
	@Autowired
	private DocumentDao dao;
	@Override
	public Document getDocumentById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public Document addDocument(Document doc, Long id) {
		Collaborateur c = this.collaborateurDao.findById(id).get();
		doc.setContact(c);
		return this.dao.save(doc);
	}

	@Override
	public void updateDocument(Document doc) {
		this.dao.save(doc);
	}

	@Override
	public List<Document> allDocuments() {
		return this.dao.findAll();
	}

	
}
