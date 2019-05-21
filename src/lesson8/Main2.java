package lesson8;

public class Main2 {
    public static void main(String[] args) {
        String[][] tours = {{"Greek", "15000", "polupansionat", "7 days"},
                {"Spain", "45000", "hotel", "14 days"},
                {"France", "100000", "hotel", "30 days"},
                {"France", "50000", "apartments", "6 days"}};
                TourUtils.printToursByOneCountry(tours, "France");

                TourUtils.printVeryExpensiveTour(tours);

                TourUtils.allAveragePrice(tours);
    }
}
