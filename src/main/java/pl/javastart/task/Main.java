package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Adress adress1 = new Adress("Wrocław Tarczyński Arena", "Aleja Śląska",
                1, "Wrocław", "54-118");
        Adress adress2 = new Adress("PGE Narodowy", "Aleja Poniatowskiego", 1,
                "Warszawa", "03-901");

        Ticket ticket1 = new Ticket("Queen", adress1,
                "bilet prezentowy", 400, 0);

        Ticket ticket2 = new Ticket("Dawid Podsiadło", adress1, "bilet internetowy",
                250, 0);

        Ticket ticket3 = new Ticket("Polska - Francja", adress2, "bilet standardowy",
                600, 0.1);

        TicketMethods ticketMethods = new TicketMethods();

        double finalPriceTicket1 = ticketMethods.calculateFinalPrice(ticket1);
        double finalPriceTicket2 = ticketMethods.calculateFinalPrice(ticket2);
        double finalPriceTicket3 = ticketMethods.calculateFinalPrice(ticket3);

        System.out.println(ticketMethods.buyTicket());

    }
}
