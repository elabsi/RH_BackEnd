package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.DocumentController;
import ma.ensa.entities.Document;
import ma.ensa.metiers.DocumentMetier;

@RestController
@RequestMapping("/document")
public class DocumentControllerImpl implements DocumentController {
 
	@Autowired
	private DocumentMetier documentMetier;
	@Override
	@PostMapping("/getDocumentById")
	public Document getDocumentById(@RequestBody Long id) {
		return documentMetier.getDocumentById(id);
	}

	@Override
	@PostMapping("/addDocument/{id}")
	public Document addDocument(@RequestBody Document document,@PathVariable Long id) {
		return documentMetier.addDocument(document, id);
	}

	@Override
	@PostMapping("/updateDocument")
	public void updateDocument(@RequestBody Document document) {
		documentMetier.updateDocument(document);
	}

	@Override
	@GetMapping("/allDocuments")
	public List<Document> allDocuments() {
		return documentMetier.allDocuments();
	}

	
}
