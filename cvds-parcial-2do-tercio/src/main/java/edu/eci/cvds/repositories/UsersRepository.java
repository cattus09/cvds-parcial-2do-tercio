package edu.eci.cvds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.eci.cvds.model.Users;

@Repository
public class UsersRepository extends JpaRepository<Users,Long>{
    
}



	

