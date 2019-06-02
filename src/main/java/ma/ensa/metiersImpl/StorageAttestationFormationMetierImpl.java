package ma.ensa.metiersImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import ma.ensa.dao.AttestationFormationDao;
import ma.ensa.entities.AttestationFormation;
import ma.ensa.metiers.StorageAttestationFormationMetier;

@Service
@Transactional
public class StorageAttestationFormationMetierImpl implements StorageAttestationFormationMetier{



	  Logger log = LoggerFactory.getLogger(this.getClass().getName());
	  private final Path rootLocation = Paths.get("app-rh-files");
	  private final Path rootLocation2 = Paths.get("app-rh-files/pdf-attestation-formation");
	  @Autowired
	  private AttestationFormationDao attestationFormationDao;
	  public String store(MultipartFile file, String id) {
	    try {

	    	
			String name = file.getOriginalFilename();
			String fname="", ext="";
			Pattern p = Pattern.compile(".[a-zA-Z0-9]+");
			Matcher m1 = p.matcher(name);
			while (m1.find()) 
			{ 
			   ext = m1.group();
			} 
			fname += id + "_" + new Date().getTime();
			File convertFile  = new File(this.rootLocation2.toString() + "/" + fname + ext);
			convertFile.createNewFile();
			FileOutputStream fout=new FileOutputStream(convertFile);
			Optional<AttestationFormation> ats = this.attestationFormationDao.findById(Long.parseLong(id));
	    	if(ats.isPresent()) {
				fout.write(file.getBytes());
				ats.get().setNomFichier(fname + ext);
	    	}
			fout.close();
			return fname + ext;
	    } catch (Exception e) {
	      throw new RuntimeException("FAIL!");
	    }
	  }
	 
	  public Resource loadFile(String filename) {
	    try {
	      Path file = rootLocation2.resolve(filename);
	      Resource resource = new UrlResource(file.toUri());
	      if (resource.exists() || resource.isReadable()) {
	        return resource;
	      } else {
	        throw new RuntimeException("FAIL!");
	      }
	    } catch (MalformedURLException e) {
	      throw new RuntimeException("FAIL!");
	    }
	  }
	 
	  public void deleteAll() {
		    FileSystemUtils.deleteRecursively(rootLocation2.toFile());
		    FileSystemUtils.deleteRecursively(rootLocation.toFile());
	  }
	 
	  public void init() {
	    try {
	    	File direct = new File(rootLocation.toUri());
	    	if(!direct.exists()) {
			      Files.createDirectory(rootLocation);
	    	}
	    	direct = new File(rootLocation2.toUri());
	    	if(!direct.exists()) {
			      Files.createDirectory(rootLocation2);
	    	}
	    } catch (IOException e) {
	      throw new RuntimeException("Could not initialize storage!");
	    }
	  }

}
