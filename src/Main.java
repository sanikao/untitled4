import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //11
        ArrayList<String> countries1 = new ArrayList<>();
        countries1.add("Kyrgyzstan");
        countries1.add("Canada");
        countries1.add("Russia");

        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("Canada");
        countries2.add("Spain");
        countries2.add("Russia");

        ArrayList<String> commonCountries = new ArrayList<>();
        for (String country : countries1) {
            if (countries2.contains(country)) {
                commonCountries.add(country);
            }
        }
        System.out.println("11 common countries: " + commonCountries);


        //12
        ArrayList<String> names = new ArrayList<>();
        names.add("Tilekmat");
        names.add("Aruuke");
        names.add("Saikal");
        names.add("Azema");

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() % 2 == 0) {
                names.remove(i);
                i--;
            }
        }
        System.out.println("12 names: " + names);


        //13
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Young and beautiful");
        songs.add("All the things she said");
        songs.add("Take on me");

        String shortestSong = songs.get(0);
        for (String song : songs) {
            if (song.length() < shortestSong.length()) {
                shortestSong = song;
            }
        }
        System.out.println("13 shortest song: " + shortestSong);


        //14
        ArrayList<String> words = new ArrayList<>();
        words.add("ice");
        words.add("cottage");
        words.add("room");

        for (int i = 0; i < words.size(); i++) {
            String w = words.get(i);
            w = w.replace("a", "*")
                    .replace("e", "*")
                    .replace("i", "*")
                    .replace("o", "*")
                    .replace("u", "*");
            words.set(i, w);
        }
        System.out.println("14 words: " + words);


        //15
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        System.out.println("15 even: " + even);
        System.out.println("15 odd: " + odd);


        //16
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");

        Collections.rotate(days, 2);
        System.out.println("16 rotated days: " + days);


        //17
        ArrayList<String> students = new ArrayList<>();
        students.add("Sanira");
        students.add(null);
        students.add("Azema");
        students.add(null);

        while (students.contains(null)) {
            students.remove(null);
        }
        System.out.println("17 students: " + students);


        //18
        ArrayList<String> movieTitles = new ArrayList<>();
        movieTitles.add("Amelie");
        movieTitles.add("Twilight");
        movieTitles.add("Interstellar");

        String largest = "";
        String secondLargest = "";

        for (String title : movieTitles) {
            if (title.length() > largest.length()) {
                secondLargest = largest;
                largest = title;
            } else if (title.length() > secondLargest.length() && !title.equals(largest)) {
                secondLargest = title;
            }
        }
        System.out.println("18 second largest movie: " + secondLargest);


        //19
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Peach");
        fruits.add("Banana");
        fruits.add("Kiwi");

        ArrayList<Integer> fruitLengths = new ArrayList<>();
        for (String fruit : fruits) {
            fruitLengths.add(fruit.length());
        }
        System.out.println("19 fruit lengths: " + fruitLengths);


        //20
        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> it = new ArrayList<>();
        it.add("Tilek");
        it.add("Saikal");

        ArrayList<String> hr = new ArrayList<>();
        hr.add("Aruuke");
        hr.add("Sanira");

        departments.add(it);
        departments.add(hr);

        System.out.println("20 departments:");
        for (ArrayList<String> dept : departments) {
            System.out.println(dept);
        }
    }
}
