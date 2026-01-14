package org.example;

public class AlunoValidator {

    public static void validar(AlunoRequestDTO dto) {
        if (dto.getNome() == null || dto.getNome().isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }

        if (dto.getIdade() <= 0) {
            throw new IllegalArgumentException("Idade inválida");
        }

        if (dto.getObjetivo() == null ) {
            throw new IllegalArgumentException("Objetivo inválido");
        }
    }
}
