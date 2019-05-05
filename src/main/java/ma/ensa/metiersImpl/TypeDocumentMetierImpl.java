package ma.ensa.metiersImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.dao.TypeDocumentDao;
import ma.ensa.entities.TypeDocument;
import ma.ensa.metiers.TypeDocumentMetier;

@Service
public class TypeDocumentMetierImpl implements TypeDocumentMetier {
 
	@Autowired
	private TypeDocumentDao dao;
	@Override
	public TypeDocument getTypeDocumentById(Long id) {
		return this.dao.findById(id).get();
	}

	@Override
	public TypeDocument addTypeDocument(TypeDocument typeDoc) {
		return this.dao.save(typeDoc);
	}

	@Override
	public void updateTypeDocument(TypeDocument typeDoc) {
		this.dao.save(typeDoc);
	}

	@Override
	public List<TypeDocument> allTypeDocuments() {
		return this.dao.findAll();
	}

	
}
