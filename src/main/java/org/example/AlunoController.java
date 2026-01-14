package org.example;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.util.List;

    @RestController
    @RequestMapping("/alunos")
    public class AlunoController {

        private final AlunoRepository repository;

        public AlunoController(AlunoRepository repository) {
            this.repository = repository;
        }

        @PostMapping
        public ResponseEntity<Aluno> criar(@RequestBody AlunoRequestDTO dto) {
            AlunoValidator.validar(dto);


            Aluno aluno = new Aluno(
                    dto.getNome(),
                    dto.getIdade(),
                    dto.getObjetivo()
            );

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(repository.save(aluno));
        }

        @GetMapping
        public List<Aluno> listar() {
            return repository.findAll();
        }

        @GetMapping("/{id}")
        public Aluno buscarPorId(@PathVariable Long id) {
            return repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        }
}


