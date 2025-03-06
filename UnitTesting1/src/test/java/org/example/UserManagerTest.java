package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserManagerTest {

    static  UserManager um;
    @BeforeAll
    static void setUp(){
        um = new UserManager();
    }

    @BeforeEach
    void setupMethod() {
        um.addUser("khantolan baju");
        um.addUser("ulilaliput");
        um.addUser("wibutzy");
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void afterAll(){
        System.out.println("done ga bang?");
    }

    @Test
    @Order(1)
    void addUser() {
        um.addUser("yanto bekri");
        Assertions.assertTrue(um.userExist("yanto bekri"));
    }

    @Test
    @Order(2)
    void removeUser() {
        um.removeUser("yanto bekri");
        Assertions.assertFalse(um.userExist("yanto bekri"));
    }

    @Test
    @Order(3)
    void getUserCount() {
        Assertions.assertEquals(3,um.getUserCount());
    }

    @Test
    @Order(4)
    void userExist() {
        Assertions.assertTrue(um.userExist("ulilaliput"));
    }

    @Test
    @Order(5)
    void clearUser() {
        um.clearUser();
        Assertions.assertEquals(0, um.getUserCount());
    }
}