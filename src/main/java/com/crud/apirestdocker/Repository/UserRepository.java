package com.crud.apirestdocker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crud.apirestdocker.User.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
