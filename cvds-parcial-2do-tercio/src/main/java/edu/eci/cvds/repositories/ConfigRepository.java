package edu.eci.cvds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.eci.cvds.model.Users;

@Repository
public class ConfigRepository extends JpaRepository<Users,Long>{
    
}
