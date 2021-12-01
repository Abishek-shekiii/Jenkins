package com.abishek.repoistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abishek.model.User;

public interface UserRepoistory extends JpaRepository<User, Long> {

}
