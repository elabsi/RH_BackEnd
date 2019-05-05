package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.PeriodeDepartement;

public interface PeriodaDepartementDao extends JpaRepository<PeriodeDepartement, Long> {

}
