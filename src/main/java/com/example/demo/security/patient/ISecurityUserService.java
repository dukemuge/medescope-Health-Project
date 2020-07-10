package com.example.demo.security.patient;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
