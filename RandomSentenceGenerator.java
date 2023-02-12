import java.util.Random;
import java.util.Scanner;

public class RandomSentenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] names = {"John", "Mary", "Arthur", "Sadie", "Dutch", "Mike"};
        String[] places = {"Rhodes", "Valentine", "Saint Denis", "Sofia", "Berlin"};
        String[] verbs = {"shoots", "picks up", "sees", "brings", "holds"};
        String[] nouns = {"a bottle", "an apple", "a can of beans", "a rabbit"};
        String[] adverbs = {"quickly", "carefully", "proudly"};
        String[] details = {"near the lake", "in town", "in camp", "in the forest"};

        String test = "";
        while (test.equals("")) {
            String name = getRandomWord(names);
            String place = getRandomWord(places);
            String verb = getRandomWord(verbs);
            String noun = getRandomWord(nouns);
            String adverb = getRandomWord(adverbs);
            String detail = getRandomWord(details);

            boolean hasPlace = random.nextBoolean();
            boolean hasAdverb = random.nextBoolean();
            boolean hasDetail = random.nextBoolean();

            System.out.print(name + " ");
            if (hasPlace) {
                System.out.print("from " + place + " ");
            }
            if (hasAdverb) {
                System.out.print(adverb + " ");
            }
            System.out.print(verb + " ");
            System.out.print(noun);
            if (hasDetail) {
                System.out.print(" " + detail);
            }
            System.out.println(".");

            System.out.println("Press [Enter] to generate another one");
            test = scanner.nextLine();
        }
    }

    public static String getRandomWord(String[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }
}