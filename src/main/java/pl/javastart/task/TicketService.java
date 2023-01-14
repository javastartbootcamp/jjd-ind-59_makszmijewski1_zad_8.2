package pl.javastart.task;

import java.util.Scanner;

public class TicketService {

    private static final int CHOICE_1 = 1;
    private static final int CHOICE_2 = 2;
    private static final int CHOICE_3 = 3;
    private static final String QUEEN_EVENT_NAME = "Queen";
    private static final String DAWID_PODSIADLO_EVENT_NAME = "Dawid Podsiadło";
    private static final String POLSKA_FRANCJA_EVENT_NAME = "Polska - Francja";
    private static final int LOGISTICS_COST = 5;
    private static final double COMMISSION_GIFT_TICKET = 0.05;

    public double calculateFinalPrice(Ticket ticket) {
        return switch (ticket.getTicketType()) {
            case Ticket.TYPE_INTERNET ->
                ticket.getBasicPrice() * (1 - ticket.getDiscount());
            case Ticket.TYPE_STANDARD ->
                    ticket.getBasicPrice() * (1 - ticket.getDiscount()) + LOGISTICS_COST;
            case Ticket.TYPE_GIFT ->
                ticket.getBasicPrice() * (1 - ticket.getDiscount()) + LOGISTICS_COST
                        + (COMMISSION_GIFT_TICKET * ticket.getBasicPrice() * (1 - ticket.getDiscount()));
            default ->
                0;
        };
    }

    public Ticket buyTicket() {
        String eventName = loadEventName();
        String ticketType = loadTicketType();
        double price = loadPrice(eventName);
        double discount = loadDiscount();

        Adress adress = new Adress("Wrocław Tarczyński Arena", "Aleja Śląska",
                1, "Wrocław", "54-118");

        return new Ticket(eventName, adress, ticketType, price, discount);
    }

    private String loadEventName() {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        String eventName = "";

        while (condition) {
            System.out.println("Cześć, na jakie wydarzenie "
                    + "chcesz kupić bilet?");
            System.out.println(CHOICE_1 + " " + QUEEN_EVENT_NAME);
            System.out.println(CHOICE_2 + " " + DAWID_PODSIADLO_EVENT_NAME);
            System.out.println(CHOICE_3 + " " + POLSKA_FRANCJA_EVENT_NAME);
            switch (scanner.nextInt()) {
                case CHOICE_1 -> {
                    return QUEEN_EVENT_NAME;
                }
                case CHOICE_2 -> {
                    return DAWID_PODSIADLO_EVENT_NAME;
                }
                case CHOICE_3 -> {
                    return POLSKA_FRANCJA_EVENT_NAME;
                }
                default -> {
                    System.out.println("Wskazałeś niepoprawną wartość, spróbuj jeszcze raz");
                }
            }
        }
        return eventName;
    }

    private String loadTicketType() {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        String ticketType = "";
        while (condition) {
            System.out.println("Jaki typ biletu chcesz kupic?");
            System.out.println(CHOICE_1 + " " + Ticket.TYPE_INTERNET);
            System.out.println(CHOICE_2 + " " + Ticket.TYPE_STANDARD);
            System.out.println(CHOICE_3 + " " + Ticket.TYPE_GIFT);
            switch (scanner.nextInt()) {
                case CHOICE_1 -> {
                    return Ticket.TYPE_INTERNET;
                }
                case CHOICE_2 -> {
                    return Ticket.TYPE_STANDARD;
                }
                case CHOICE_3 -> {
                    return Ticket.TYPE_GIFT;
                }
                default -> {
                    System.out.println("Wskazałeś niepoprawną wartość, spróbuj jeszcze raz");
                }
            }
        }
        return ticketType;
    }

    private double loadPrice(String eventName) {
        double price = 0;
        boolean condition = true;
        while (condition) {
            switch (eventName) {
                case QUEEN_EVENT_NAME -> {
                    return 350;
                }
                case DAWID_PODSIADLO_EVENT_NAME -> {
                    return 250;
                }
                case POLSKA_FRANCJA_EVENT_NAME -> {
                    return 600;
                }
                default -> {
                    System.out.println("Spróbuj od nowa");
                }
            }
        }
        return price;
    }

    private double loadDiscount() {
        Scanner scanner = new Scanner(System.in);
        double discount = 0;
        boolean condition = true;
        while (condition) {
            System.out.println("Czy posiadasz kod rabatowy?");
            System.out.println("1 Tak zniżka 10%");
            System.out.println("2 Tak zniżka 15%");
            System.out.println("3 Nie, nie posiadam");
            switch (scanner.nextInt()) {
                case CHOICE_1 -> {
                    return 0.1;
                }
                case CHOICE_2 -> {
                    return 0.15;
                }
                case CHOICE_3 -> {
                    return 0;
                }
                default -> {
                    System.out.println("Wskazałeś niepoprawną wartość, spróbuj jeszcze raz");
                }
            }
        }
        return discount;
    }
}
