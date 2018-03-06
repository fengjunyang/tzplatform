package com.topcheer.dao.jpa;

import com.topcheer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by feng on 2018/3/6.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
