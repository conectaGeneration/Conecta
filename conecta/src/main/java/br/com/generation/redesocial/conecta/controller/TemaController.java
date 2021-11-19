package br.com.generation.redesocial.conecta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.generation.redesocial.conecta.model.Tema;
import br.com.generation.redesocial.conecta.repository.TemaRepository;

@RestController
@RequestMapping("/tema")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TemaController {

	@Autowired
	private TemaRepository repository;

	@GetMapping
	public ResponseEntity<List<Tema>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Tema> getById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
<<<<<<< HEAD

	@GetMapping("/segmento/{segmento}")
	public ResponseEntity<List<Tema>> GetBySegmento(@PathVariable String segmento) {
		return ResponseEntity.ok(repository.findAllBySegmentoContainingIgnoreCase(segmento));
	}

	@PostMapping
	public ResponseEntity<Tema> PostTema(@RequestBody Tema tema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
	}

	@PutMapping
	public ResponseEntity<Tema> PutTema(@RequestBody Tema tema) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(tema));
	}

=======
	
	@GetMapping("/segmento/{segmento}")
	public ResponseEntity<List<Tema>> getBySegmento (@PathVariable String segmento) {
		return ResponseEntity.ok(repository.findAllBySegmentoContainingIgnoreCase(segmento));
	}
	
	@PostMapping
	public ResponseEntity<Tema> post (@RequestBody Tema tema){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
	}
	
	@PutMapping
	public ResponseEntity<Tema> put (@RequestBody Tema tema){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(tema));
	}
	
>>>>>>> main
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
