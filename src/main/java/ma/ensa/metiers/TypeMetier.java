package ma.ensa.metiers;

import ma.ensa.entities.Type;

public interface TypeMetier{
	public Type AddType(Type type);
	public void UpdateType(Type type);
	public Type getTypeById(Long id);


}
