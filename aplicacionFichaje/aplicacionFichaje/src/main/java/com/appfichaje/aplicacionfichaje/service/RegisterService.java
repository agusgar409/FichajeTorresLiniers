package com.appfichaje.aplicacionfichaje.service;

public interface RegisterService {

    void registerEvent(Long id, String type);


    void registerUser(String name, Long role, Long idCompany);
}
