package com.revature.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Species;

@Repository
public interface SpeciesRepository extends JpaRepository<Species,Integer>{

	Optional<Species> findBySpeciesName(String speciesName);
}
