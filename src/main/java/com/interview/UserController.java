package com.interview;

import java.util.Arrays;
import java.util.List;

public class UserController {
  public List<User> getAllusers() {
    User u1 = new User();
    u1.setFirstname("Mike");
    u1.setSurname("Brecker");
    u1.setUserName("michaelb@test.com");
    u1.setUserRoles(createRoles1());

    User u2 = new User();
    u2.setFirstname("Sarah");
    u2.setSurname("Vaughan");
    u2.setUserName("sarahsinger@test.com");
    u2.setUserRoles(createRoles2());

    User u3 = new User();
    u3.setFirstname("Herb");
    u3.setSurname("Alpert");
    u3.setUserName("herb.alpert@test.com");
    u3.setUserRoles(createRoles3());

    User u4 = new User();
    u4.setFirstname("Joan");
    u4.setSurname("Armatrading");
    u4.setUserName("joanarmatrading@test.com");
    u4.setUserRoles(null);

    List<User> allUsers = Arrays.asList(u1,u2,u3,u4);

    return allUsers;
  }

  String role1 = "Admin";
  String role2 = "Tester";
  String role3 = "SuperUser";
  String role4 = "RestrictedUser";
  String roleNull = null;
  String roleEmpty = "";

  private List<String> createRoles1() {
    List<String> roles = Arrays.asList(role1,role2,role3);
    return roles;
  }

  private List<String> createRoles2() {
    List<String> roles = Arrays.asList(role1,role4,roleNull);
    return roles;
  }

  private List<String> createRoles3() {
    List<String> roles = Arrays.asList(role2,role3,roleEmpty);
    return roles;
  }
}
