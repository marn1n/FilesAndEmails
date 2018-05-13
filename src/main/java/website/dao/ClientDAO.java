package website.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import website.entity.Client;

import java.util.List;

public interface ClientDAO extends JpaRepository<Client, Integer>{

//    @Query("select c from Client c where c.email =: x")
//    List<Client> xxx(@Param("x") String email);
//    List<Client> findAllByEmail(String email);
}
