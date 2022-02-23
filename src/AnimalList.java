import java.util.*;

public class AnimalList {
    ArrayList<String> animals;

    /**
     * Constructor for the class
     */
    public AnimalList() {
        animals = new ArrayList<>();
    }

    /**
     * Uses a hashset to remove any duplicates in a list
     * Sorts the list alphabetically
     * @param data original list of unsorted list with possible duplicates
     * @return the sorted unique list
     */
    public ArrayList<String> getUniqueSortedList() {
        HashSet<String> set = new HashSet<String>(animals);
        List<String> sortedAnimals = new ArrayList<String>(set);
        for (Object ob : sortedAnimals) {
    }
        Collections.sort(sortedAnimals);
            return (ArrayList<String>) sortedAnimals;





    }

    /**
     * Reads the list of animal types
     */
    public void readAnimalsFile() {
        animals = FileIO.readDataFromFile(FileIO.DATA_FILE);
    }

    /**
     * Returns the current size of the list
     * @return the integer representing the list size
     */
     public int getAnimalListSize() {
         int listSize = animals.size();
         return listSize;
     }


    /**
     * Get a random animal from the ArrayList
     * @return the random Animal name
     */
    public String getRandomAnimal() {
        Random rnd = new Random();
        String rndAnimal = animals.get(rnd.nextInt(316));
        return rndAnimal;

    }

    /**
     * Search through the entire animals ArrayList to see if a specific animal is in the list
     * Ignore case in the search
     * @param searchAnimal
     * @return the index of the animal if it is found or -1 if it is not found
     */
    public int findAnimal(String searchAnimal) {
        int index = 0;
        for (int i = 0; i < animals.size() ; i++) {
            String name = animals.get(i);
            if (name == searchAnimal) {
                index = i;
            }
        }
            return index;



    }

    /**
     * Get animal name to search for
     * @return the animal name
     */
    public String getAnimalName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter animal name: ");
        String name = scanner.nextLine();
        return name;
    }


    /**
     * Print out all of the animals in the ArrayList in a row separated by commas
     * (don't add a comma to the last item in the list.)
     */
    public void printAllAnimals() {
        String allAnimals = String.join(", ", animals);
        System.out.println(allAnimals);
    }

    /**
     * Iterate through the list to find the longest animal name in terms of characters
     * Print out the longest name and how many characters it has!
     */
    //public void findLongestName()

    /**
     * Find the most frequent initial letter the occurs in the animal names (the first letter of the name)
     * Keep a count of the initial letters print out the letter that occurs the most and how many times it occurs
     */
    //public void findMostFrequentInitialLetter()
}
