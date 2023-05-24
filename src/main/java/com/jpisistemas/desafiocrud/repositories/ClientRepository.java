package com.jpisistemas.desafiocrud.repositories;

import com.jpisistemas.desafiocrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Long>{

}
