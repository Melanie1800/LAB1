package edu.pucp.gtics.lab1_gtics_20211.repository;


import edu.pucp.gtics.lab1_gtics_20211.entity.Distribuidoras;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DistribuidorasRepository extends JpaRepository<Distribuidoras,Integer> {

}
