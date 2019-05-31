package ma.ensa.metiersImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource; 
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ma.ensa.dao.CollaborateurDao;
import ma.ensa.entities.Collaborateur;
import ma.ensa.metiers.StoragePhotoCollabMetier;

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
import org.springframework.core.io.UrlResource;
import org.springframework.util.FileSystemUtils;

@Service
@Transactional
public class StoragePhotoCollabMetierImpl implements StoragePhotoCollabMetier{


	  Logger log = LoggerFactory.getLogger(this.getClass().getName());
	  private final Path rootLocation = Paths.get("app-rh-files");
	  private final Path rootLocation2 = Paths.get("app-rh-files/photos-collaborateurs");
	  @Autowired
	  private CollaborateurDao collaborateurDao;
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
			Optional<Collaborateur> cb = this.collaborateurDao.findById(Long.parseLong(id));
	    	if(cb.isPresent()) {
				fout.write(file.getBytes());
				cb.get().setPhoto(fname + ext);
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
