package com.trifulcas.mavensecurity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.trifulcas.mavensecurity.model.User;
@Entity
@Table(name = "authorities")
public class Authorities {
  @Id
  @Column(name = "authority")
  private String authority;

  @ManyToOne
  @JoinColumn(name = "username")
  private User user;

  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

}
