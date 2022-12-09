package br.com.github.douglasboaventura.musica;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ListaMusicasController {
    private final MusicaRepository repository;

    public ListaMusicasController(MusicaRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/musicas")
    public ResponseEntity<?> listar() {
        List<MusicaResponse> musicas = repository.findAll()
                .stream()
                .map(MusicaResponse::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok(musicas);
    }
}
