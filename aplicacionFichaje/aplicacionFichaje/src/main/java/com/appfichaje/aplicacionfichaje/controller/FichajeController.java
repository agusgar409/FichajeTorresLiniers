package com.appfichaje.aplicacionfichaje.controller;

import com.appfichaje.aplicacionfichaje.model.dto.RecordsResponse;
import com.appfichaje.aplicacionfichaje.service.RegisterService;
import com.appfichaje.aplicacionfichaje.service.ShowInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fichajes")
public class FichajeController {


    @Autowired
    private RegisterService registerService;

    @Autowired
    private ShowInfoService showInfoService;

    @PostMapping("/marcar")
    public ResponseEntity<String> registerEvent(@RequestParam Long usuarioId, @RequestParam String type) {

        registerService.registerEvent(usuarioId,type);

        return ResponseEntity.ok("Registro de " + type + " guardado correctamente.");
    }

    @PutMapping("/nuevo-usuario")
    public ResponseEntity<String> newUser(@RequestParam String name, @RequestParam Long role, @RequestParam Long idCompany) {

        registerService.registerUser(name,role,idCompany);

        return ResponseEntity.ok("Registro de " + name + " guardado correctamente.");

    }

    @GetMapping("/lista-fichajes")
    public ResponseEntity<List<RecordsResponse>> signingList() {

        List<RecordsResponse> list = showInfoService.getSigningList();

        return ResponseEntity.ok(list);

    }
}
