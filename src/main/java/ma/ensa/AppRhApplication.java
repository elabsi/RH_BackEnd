package ma.ensa;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.ensa.metiers.StorageContratMertier;
import ma.ensa.metiers.StorageAttestationFormationMetier;
import ma.ensa.metiers.StoragePhotoCollabMetier;


@SpringBootApplication
public class AppRhApplication  implements CommandLineRunner {
	 
	 @Resource
	  StoragePhotoCollabMetier storagePhotoCollabMetier;
	 @Resource
	  StorageAttestationFormationMetier storagePdfAttestationFormationMetier;
	 @Resource
	  StorageContratMertier storageContratMertier;
	 
		@Autowired
		public static void main(String[] args) {
			SpringApplication.run(AppRhApplication.class, args);
		}
	 
	  @Override
	  public void run(String... arg) throws Exception {
//	    storageService.deleteAll();
		  storagePhotoCollabMetier.init();
		  storagePdfAttestationFormationMetier.init();
		  storageContratMertier.init();
	  }
	}


