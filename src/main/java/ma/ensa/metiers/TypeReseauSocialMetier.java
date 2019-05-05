package ma.ensa.metiers;

import java.util.List;

import ma.ensa.entities.TypeReseauSocial;

public interface TypeReseauSocialMetier {

	public TypeReseauSocial addTypeReseauSocial(TypeReseauSocial typeReseauSocial);
	public void updateTypeReseauSocial(TypeReseauSocial typeReseauSocial);
	public TypeReseauSocial getTypeReseauSocialById(Long id);
    public List<TypeReseauSocial> allTypeReseauSocials();
}
