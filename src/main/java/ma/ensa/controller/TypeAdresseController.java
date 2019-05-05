package ma.ensa.controller;

import java.util.List;

import ma.ensa.entities.TypeAdresse;

public interface TypeAdresseController {
	public TypeAdresse addTypeAdresse(TypeAdresse typeAdresse);
	public void updateTypeAdresse(TypeAdresse typeAdresse);
	public TypeAdresse getTypeAdresseById(Long id);
	public List<TypeAdresse> allTypeAdresses();
}
