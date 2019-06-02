package ma.ensa.metiers;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageContratMertier {

	public String store(MultipartFile file, String id);
	public Resource loadFile(String filename);
	public void deleteAll();
	public void init();

}
