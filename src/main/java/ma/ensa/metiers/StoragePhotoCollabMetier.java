package ma.ensa.metiers;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;

public interface StoragePhotoCollabMetier {

	public String store(MultipartFile file, String id);
	public Resource loadFile(String filename);
	public void deleteAll();
	public void init();
}
