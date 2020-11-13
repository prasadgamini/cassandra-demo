package edu.cassandra.cassandrademo.repo;

import edu.cassandra.cassandrademo.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<User, Serializable> {
    Optional<User> findById(int id);
}
