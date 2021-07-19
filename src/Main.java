public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2542;
        int rubForMiles = 20;

        int bonusMiles = ticketPrice/rubForMiles;

        System.out.println("Количество начисленных бонусных милль: " + bonusMiles);
    }
}
