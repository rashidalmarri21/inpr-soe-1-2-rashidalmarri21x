import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        animalList.readAnimalsFile();

        //Print out the number of animals in the list
        System.out.println(animalList.getAnimalListSize());

        //Print the entire list of the animals in the file using the printAllAnimals method
        animalList.printAllAnimals();

        //Ask the user for an animal name to search for using the method getAnimalName
        System.out.println(animalList.getAnimalName());


        //Search for the animal name using findAnimal
        System.out.println(animalList.findAnimal("Badger"));

        //Print out if the animal is found or not - print out the relevant index if it is found

        //Call the method findLongestName

        //Call the method findMostFrequentInitialLetter

    }

}
