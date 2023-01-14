package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Adress adress1 = new Adress("Wrocław Tarczyński Arena", "Aleja Śląska",
                1, "Wrocław", "54-118");
        Adress adress2 = new Adress("PGE Narodowy", "Aleja Poniatowskiego", 1,
                "Warszawa", "03-901");

        TicketService ticketService = new TicketService();
        Ticket ticket = ticketService.buyTicket();
        double finalPrice = ticketService.calculateFinalPrice(ticket);
        System.out.println(ticket);
        System.out.println(finalPrice);

    }
}
