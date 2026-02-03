import java.util.ArrayList;

class other {

    public static void main(String[] args) {

        //1
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("book a");
        books1.add("book b");

        ArrayList<String> books2 = new ArrayList<>();
        books2.add("book b");
        books2.add("book c");

        for (String book : books2) {
            if (!books1.contains(book)) {
                books1.add(book);
            }
        }
        System.out.println("1 books: " + books1);


        //2
        ArrayList<String> movies = new ArrayList<>();
        movies.add("amelie");
        movies.add("interstellar");
        movies.add("twilight");

        String longestMovie = movies.get(0);
        for (String movie : movies) {
            if (movie.length() > longestMovie.length()) {
                longestMovie = movie;
            }
        }
        System.out.println("2 longest movie: " + longestMovie);


        //3
        ArrayList<String> foods = new ArrayList<>();
        foods.add("pizza");
        foods.add("beshbarmak");
        foods.add("pizza");

        int pizzaCount = 0;
        for (String food : foods) {
            if (food.equals("pizza")) {
                pizzaCount++;
            }
        }
        System.out.println("3 pizza count: " + pizzaCount);


        //4
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("almurut");
        fruits.add("banana");

        while (fruits.contains("banana")) {
            fruits.remove("banana");
        }
        System.out.println("4 fruits: " + fruits);


        //5
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");

        colors.replaceAll(ignored -> "black");
        System.out.println("5 colors: " + colors);


        //6
        ArrayList<String> sports = new ArrayList<>();
        sports.add("football");
        sports.add("hockey");
        sports.add("basketball");

        ArrayList<String> subSports = new ArrayList<>();
        subSports.add("football");
        subSports.add("hockey");

        boolean containsAll = true;
        for (String s : subSports) {
            if (!sports.contains(s)) {
                containsAll = false;
            }
        }
        System.out.println("6 contains sublist: " + containsAll);


        //7
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("rose");
        flowers.add("lily");
        flowers.add("rose");

        int firstIndex = flowers.indexOf("rose");
        int lastIndex = flowers.lastIndexOf("rose");

        System.out.println("7 first index: " + firstIndex);
        System.out.println("7 last index: " + lastIndex);


        //8
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("cat");

        ArrayList<String> uniqueAnimals = new ArrayList<>();
        for (String animal : animals) {
            if (!uniqueAnimals.contains(animal)) {
                uniqueAnimals.add(animal);
            }
        }
        System.out.println("8 animals: " + uniqueAnimals);


        //9
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Montreal");
        cities.add("Moscow");

        String[] cityArray = new String[cities.size()];
        for (int i = 0; i < cities.size(); i++) {
            cityArray[i] = cities.get(i);
        }

        System.out.print("9 cities array: ");
        for (String city : cityArray) {
            System.out.print(city + " ");
        }
        System.out.println();


        //10
        int[] numbers = {1, 2, 3};

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }
        System.out.println("10 number list: " + numberList);
    }
}
