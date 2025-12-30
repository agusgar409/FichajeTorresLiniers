package com.appfichaje.aplicacionfichaje.service.impl;

import com.appfichaje.aplicacionfichaje.model.Record;
import com.appfichaje.aplicacionfichaje.model.dto.RecordsResponse;
import com.appfichaje.aplicacionfichaje.repository.RecordRepository;
import com.appfichaje.aplicacionfichaje.service.ShowInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowInfoServiceImpl implements ShowInfoService {

    @Autowired
    private RecordRepository recordRepository;

    @Override
    public List<RecordsResponse> getSigningList() {
        List<RecordsResponse> list = new ArrayList<>();
        List<Record> records = recordRepository.findAll();

        records.forEach(r -> {
            RecordsResponse response = new RecordsResponse();
            response.setUser(r.getUser().getName());
            response.setType(r.getType());
            response.setDateTime(r.getDateTime());

            list.add(response);
        });
        return list;
    }
}
