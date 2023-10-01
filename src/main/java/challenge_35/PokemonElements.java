package challenge_35;

import java.util.HashMap;
import java.util.Map;

public class PokemonElements {

    public PokemonElements(String pokemonElement) {
        // Convert the provided element to uppercase to make the check case-insensitive
        String upperCaseElement = pokemonElement.toUpperCase();

        // Check if the provided element is in the list of available types
        if (isValidType(upperCaseElement)) {
            this.pokemonElement = upperCaseElement;
        } else {
            throw new IllegalArgumentException("Invalid Pokémon type: " + pokemonElement);
        }

        pokemonEffective = defineEffectiveType(pokemonElement);
        pokemonNotEffective = defineNotEffectiveType(pokemonElement);

    }

    public String getPokemonElement() {
        return pokemonElement;
    }

    public String getPokemonEffective() {
        return pokemonEffective;
    }

    public String getPokemonNotEffective() {
        return pokemonNotEffective;
    }

    private boolean isValidType(String element) {
        for (String availableType : AVAILABLE_TYPES) {
            if (availableType.equals(element)) {
                return true;
            }
        }
        return false;
    }

    private String defineEffectiveType (String pokemonElement){

        String upperCaseElement = pokemonElement.toUpperCase();
        Map<String, String> possibleTypes=new HashMap<>();

        possibleTypes.put("WATER", "FIRE");
        possibleTypes.put("FIRE", "GRASS");
        possibleTypes.put("GRASS", "WATER");
        possibleTypes.put("ELECTRIC", "WATER");

        return possibleTypes.get(upperCaseElement);
    }

    private String defineNotEffectiveType (String pokemonElement){

        String upperCaseElement = pokemonElement.toUpperCase();
        Map<String, String> possibleTypes=new HashMap<>();

        possibleTypes.put("WATER", "GRASS");
        possibleTypes.put("FIRE", "WATER");
        possibleTypes.put("GRASS", "FIRE");
        possibleTypes.put("ELECTRIC", "GRASS");

        return possibleTypes.get(upperCaseElement);
    }

    private  final String[] AVAILABLE_TYPES={"WATER", "FIRE", "GRASS", "ELECTRIC"};
    private String pokemonElement;
    private String pokemonEffective;
    private String pokemonNotEffective ;
}
