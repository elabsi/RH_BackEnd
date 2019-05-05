package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.TypeDocument;

public interface TypeDocumentMetier {

	public TypeDocument addTypeDocument(TypeDocument typeDocument);
	public void updateTypeDocument(TypeDocument typeDocument);
	public TypeDocument getTypeDocumentById(Long id);
	public List<TypeDocument> allTypeDocuments();
}
