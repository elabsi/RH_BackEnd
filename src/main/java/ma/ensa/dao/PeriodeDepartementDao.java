package ma.ensa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.entities.PeriodeDepartement;

public interface PeriodeDepartementDao extends JpaRepository<PeriodeDepartement, Long> {

}
