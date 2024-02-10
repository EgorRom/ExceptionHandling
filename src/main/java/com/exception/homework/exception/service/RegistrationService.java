package com.exception.homework.exception.service;

public interface RegistrationService {


    String registrationUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException;
}
