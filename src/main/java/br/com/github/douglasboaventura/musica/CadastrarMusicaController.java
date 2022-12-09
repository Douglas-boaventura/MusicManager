package br.com.github.douglasboaventura.musica;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;

@RestController
public class CadastrarMusicaController {
    private final MusicaRepository repository;

    public CadastrarMusicaController(MusicaRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/musicas")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody @Valid MusicaRequest request, UriComponentsBuilder uriComponentsBuilder){
        Musica novaMusica = request.toModel();

        repository.save(novaMusica);

        URI location = uriComponentsBuilder.path("/musicas/{id}")
                .buildAndExpand(novaMusica.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
