package challenge_35;

/*
 * Enunciado: Crea un programa que calcule el daño de un ataque durante
 * una batalla Pokémon.
 * - La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad
 * - Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
 * - Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico
 *   (buscar su efectividad)
 * - El programa recibe los siguientes parámetros:
 *  - Tipo del Pokémon atacante.
 *  - Tipo del Pokémon defensor.
 *  - Ataque: Entre 1 y 100.
 *  - Defensa: Entre 1 y 100.
 */

public class BattlePokemon {

    public static void main(String[] args) {
        // Example 1: Fire vs. Grass
        calculateBattle(new PokemonElements("FIRE"), new PokemonElements("GRASS"), 70, 50);

        // Example 2: Water vs. Electric
        calculateBattle(new PokemonElements("WATER"), new PokemonElements("ELECTRIC"), 60, 70);

        // Example 3: Grass vs. Fire
        calculateBattle(new PokemonElements("GRASS"), new PokemonElements("FIRE"), 80, 60);

        // Example 4: Electric vs. Water
        calculateBattle(new PokemonElements("ELECTRIC"), new PokemonElements("WATER"), 90, 80);

        // Example 5: Invalid inputs (attack < 0)
        calculateBattle(new PokemonElements("FIRE"), new PokemonElements("GRASS"), -10, 50);
    }


    public static double calculateBattle(PokemonElements pokemonAttacker, PokemonElements pokemonDefender,
                               int attack, int defense){

        if (attack <= 0 || attack > 100 || defense <= 0 || defense > 100) {
            System.out.println("Attack or Defense inputs are no incorrect");
            return 0;
        }

        double attackValue = (double) attack; // Cast to double for accurate division

        if (pokemonAttacker.getPokemonEffective().equals(pokemonDefender.getPokemonElement())) {
            double battleResult = 50 * (attackValue / defense) * 2;
            System.out.println("It's super effective - battleResult: " + battleResult);
            return battleResult;
        } else if (pokemonAttacker.getPokemonNotEffective().equals(pokemonDefender.getPokemonElement())) {
            double battleResult = 50 * (attackValue / defense) * 0.5;
            System.out.println("It's not effective - battleResult: " + battleResult);
            return battleResult;
        } else {
            double battleResult = 50 * (attackValue / defense);
            System.out.println("It's neutral - battleResult: " + battleResult);
            return battleResult;
        }

    }
}
