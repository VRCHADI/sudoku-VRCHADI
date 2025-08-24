package br.com.sudoku;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class SudokuApp {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Sudoku!");

        final var positions = Stream.of(args)
                .collect(toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1]
                ));

        if (positions.containsKey("dificuldade")) {
            String nivel = positions.get("dificuldade");
            System.out.println("Dificuldade selecionada: " + nivel);
        }

        // Aqui você pode chamar a lógica do jogo, tipo iniciar tabuleiro etc.
    }
}