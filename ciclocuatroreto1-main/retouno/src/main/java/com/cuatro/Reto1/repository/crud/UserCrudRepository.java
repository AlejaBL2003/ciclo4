package com.cuatro.Reto1.repository.crud;

import com.cuatro.Reto1.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 * 
 * @author aleja
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    //Optional<User> findByName(String name);
}
