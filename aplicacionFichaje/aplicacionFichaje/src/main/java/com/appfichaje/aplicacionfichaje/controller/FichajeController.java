package com.appfichaje.aplicacionfichaje.controller;

@RestController
@RequestMapping("/api/fichajes")
public class FichajeController {

    @Autowired
    private RegistroRepository registroRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/marcar")
    public ResponseEntity<String> registrarEvento(@RequestParam Long usuarioId, @RequestParam String tipo) {
        // 1. Buscamos si el usuario existe
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        // 2. Creamos el registro con la hora actual del sistema
        Registro nuevoRegistro = new Registro();
        nuevoRegistro.setUsuario(usuario);
        nuevoRegistro.setTipo(tipo.toUpperCase());
        nuevoRegistro.setFechaHora(LocalDateTime.now());

        // 3. Guardamos en la base de datos
        registroRepository.save(nuevoRegistro);

        return ResponseEntity.ok("Registro de " + tipo + " guardado correctamente.");
    }
}
