package lesson8;

public class TourUtils {
    public static void printToursByOneCountry (String[][] tours, String country){
        for (int i = 0; i < tours.length; i++){
            if (tours[i][0].equals(country)){
                System.out.println(tours[i][0] + " " + tours[i][1] + " " + tours[i][2] + " " + tours[i][3]);
            }
        }
    }

    public static void printVeryExpensiveTour(String[][] tours){ // выбор самого дорогого тура
        int maxPrice = 0;
        for (int i = 0; i < tours.length; i++){
            int priceNum = Integer.parseInt(tours[i][1]);
            if (priceNum > maxPrice){
                maxPrice = priceNum; // одно становится другим

            }
        } System.out.println("Макс тур = " + maxPrice);
    }

    public static void allAveragePrice (String[][] tours){
        int allCoastPrice = 0;
        for (int i = 0; i < tours.length; i++){
            int priceNum = Integer.parseInt(tours[i][1]);
            allCoastPrice += priceNum;
        }
        System.out.println(allCoastPrice / tours.length);
    }
}
