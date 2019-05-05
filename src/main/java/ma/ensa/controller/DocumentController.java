package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.Document;

public interface DocumentController {


	public Document addDocument(Document document, Long id);
	public void updateDocument(Document document);
	public Document getDocumentById(Long id);
	public List<Document> allDocuments();
}
