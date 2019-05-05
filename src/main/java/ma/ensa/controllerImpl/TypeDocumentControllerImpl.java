package ma.ensa.controllerImpl;

import java.util.List ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.controller.TypeDocumentController;
import ma.ensa.entities.TypeDocument;
import ma.ensa.metiers.TypeDocumentMetier;

@RestController
@RequestMapping("/typeDocument")
public class TypeDocumentControllerImpl implements TypeDocumentController {
	@Autowired
	private TypeDocumentMetier typeDocumentMetier;
	@Override
	@PostMapping("/getTypeDocumentById")
	public TypeDocument getTypeDocumentById(@RequestBody Long id) {
		return typeDocumentMetier.getTypeDocumentById(id);
	}

	@Override
	@PostMapping("/addTypeDocument")
	public TypeDocument addTypeDocument(@RequestBody TypeDocument typeDocument) {
		return typeDocumentMetier.addTypeDocument(typeDocument);
	}

	@Override
	@PostMapping("/updateTypeDocument")
	public void updateTypeDocument(@RequestBody TypeDocument typeDocument) {
		typeDocumentMetier.updateTypeDocument(typeDocument);
	}

	@Override
	@GetMapping("/allTypeDocuments")
	public List<TypeDocument> allTypeDocuments() {
		return typeDocumentMetier.allTypeDocuments();
	}
}
