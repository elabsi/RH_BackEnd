package ma.ensa.controllerImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import ma.ensa.controller.StorageContratController;
import ma.ensa.metiers.StorageContratMertier;

@Controller
@RequestMapping("/file")
public class StorageContratControllerImpl implements StorageContratController{

	 @Autowired
	  StorageContratMertier storageService;
	 
	  List<String> files = new ArrayList<String>();
	 
	  @PostMapping("/pdfcontrat/post")
	  public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file, @RequestParam("id") String id) {
	    String message = "";
	    try {
	      message = storageService.store(file, id);
	      files.add(file.getOriginalFilename());
	 
	      return ResponseEntity.status(HttpStatus.OK).body(message);
	    } catch (Exception e) {
	      message = "";
	      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
	    }
	  }
	 
	  @GetMapping("/pdfcontrat/getallfiles")
	  public ResponseEntity<List<String>> getListFiles(Model model) {
	    List<String> fileNames = files
	        .stream().map(fileName -> MvcUriComponentsBuilder
	            .fromMethodName(StorageAttestationFormationControllerImpl.class, "getFile", fileName).build().toString())
	        .collect(Collectors.toList());
	 
	    return ResponseEntity.ok().body(fileNames);
	  }
	 
	  @GetMapping("/pdfcontrat/files/{filename:.+}")
	  @ResponseBody
	  public ResponseEntity<Resource> getFile(@PathVariable String filename) {
	    Resource file = storageService.loadFile(filename);
	    return ResponseEntity.ok()
	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
	        .body(file);
	  }
	
}
