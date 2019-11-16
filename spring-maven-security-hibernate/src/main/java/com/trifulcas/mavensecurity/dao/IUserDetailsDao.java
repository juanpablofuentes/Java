package com.trifulcas.mavensecurity.dao;

import com.trifulcas.mavensecurity.model.User;

public interface IUserDetailsDao {
  User findUserByUsername(String username);
}
