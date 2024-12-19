package com.example.servicevoiture.repositories;

import com.example.servicevoiture.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    List<Voiture> findByIdClient(Long idClient); // Requête pour filtrer par id_client

}
