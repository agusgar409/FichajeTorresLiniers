package com.appfichaje.aplicacionfichaje.service.impl;

import com.appfichaje.aplicacionfichaje.model.Record;
import com.appfichaje.aplicacionfichaje.model.User;
import com.appfichaje.aplicacionfichaje.repository.CompanyRepository;
import com.appfichaje.aplicacionfichaje.repository.RecordRepository;
import com.appfichaje.aplicacionfichaje.repository.UserRepository;
import com.appfichaje.aplicacionfichaje.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RecordRepository recordRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerEvent(Long id, String type) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        Record newRecord = new Record();
        newRecord.setUser(user);
        newRecord.setType(type.toUpperCase());
        newRecord.setDateTime(LocalDateTime.now());

        recordRepository.save(newRecord);
    }

    @Override
    public void registerUser(String name, Long role, Long idCompany) {

        User newUser = new User();
        newUser.setCompanyId(idCompany);
        newUser.setName(name);
        newUser.setRole(role);

        userRepository.save(newUser);
    }
}
