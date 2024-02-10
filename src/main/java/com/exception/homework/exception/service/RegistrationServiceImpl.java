package com.exception.homework.exception.service;

import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {


    public String registrationUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (!login.matches("^\\w{1,20}$")) {
            throw new WrongLoginException("Неверно введён логин");
        }
        if (!password.matches("^\\w{1,20}$")) {
            throw new WrongPasswordException("Пароль может состоять только из латинских букв,_, и цифр размер не более 20 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }


        return login;
    }


}
