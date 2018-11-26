package com.interview;

import java.util.List;

public class User {
  String firstname;
  String surname;
  String userName;
  List<String> userRoles;

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firsname) {
    this.firstname = firsname;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public List<String> getUserRoles() {
    return userRoles;
  }

  public void setUserRoles(List<String> userRoles) {
    this.userRoles = userRoles;
  }
}
