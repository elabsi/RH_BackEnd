package ma.ensa.controller;

import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

public interface StorageAttestationFormationController {

	  public ResponseEntity<String> handleFileUpload(MultipartFile file, String id);
	  public ResponseEntity<List<String>> getListFiles(Model model);
	  public ResponseEntity<Resource> getFile(String filename);

}
