import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Map<String, String>> animalList = new ArrayList<>();
        animalList.add(Map.of("name", "shark", "habitat", "ocean"));
        animalList.add(Map.of("name", "bear", "habitat", "land"));
        animalList.add(Map.of("name", "moose", "habitat", "land"));
        animalList.add(Map.of("name", "frog", "habitat", "swamp"));
        animalList.add(Map.of("name", "jelly fish", "habitat", "ocean"));
        animalList.add(Map.of("name", "heron", "habitat", "swamp"));
        animalList.add(Map.of("name", "whale", "habitat", "ocean"));

        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Thailand", "Bangkok");
        capitalMap.put("UK", "London");
        capitalMap.put("Australia", "Canberra");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("Egypt", "Cairo");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Italy", "Rome");
        capitalMap.put("Brazil", "Brasilia");

        System.out.println("First:");
        first(animalList);
        System.out.println("------------------------");
        System.out.println("Second:");
        second(capitalMap);
    }

    public static void first(List<Map<String, String>> animalList) {
        Map<String, List<String>> animalMap = new HashMap<>();
        Set<String> habitatList = new HashSet<>();

        for (Map<String, String> animal : animalList) {
            habitatList.add(animal.get("habitat"));
        }

//        System.out.println(habitatList); // [ocean, land, swamp]

        for (String habitat : habitatList) {
            List<String> animals = new ArrayList<>();
            for (Map<String, String> animal : animalList) {
                if (habitat.equals(animal.get("habitat"))) {
                    animals.add(animal.get("name"));
                }
            }
            animalMap.put(habitat, animals);
        }
        animalMap.forEach((key, value) -> System.out.println(key + ": " + String.join(", ", value)));
    }

    public static void second(Map<String, String> capitalMap) {
        capitalMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}