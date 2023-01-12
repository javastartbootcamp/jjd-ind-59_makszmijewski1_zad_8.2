package pl.javastart.task;

import java.util.Scanner;

public class TicketMethods {

    public double calculateFinalPrice(Ticket ticket) {
        switch (ticket.getTicketType()) {
            case "bilet internetowy" -> {
                if (ticket.getDiscount() != 0) {
                    return ticket.getBasicPrice() * (1 - ticket.getDiscount());
                } else {
                    return ticket.getBasicPrice();
                }
            }
            case "bilet standardowy" -> {
                if (ticket.getDiscount() != 0) {
                    return ticket.getBasicPrice() * (1 - ticket.getDiscount()) + 5;
                } else {
                    return ticket.getBasicPrice() + 5;
                }
            }
            case "bilet prezentowy" -> {
                if (ticket.getDiscount() != 0) {
                    return ticket.getBasicPrice() * (1 - ticket.getDiscount()) + 5
                            + (0.05 * ticket.getBasicPrice() * (1 - ticket.getDiscount()));
                } else {
                    return ticket.getBasicPrice() + 5
                            + (0.05 * ticket.getBasicPrice());
                }
            }
            default -> {
                return 0;
            }
        }
    }

    public Ticket buyTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cześć, na jakie wydarzenie "
                + "chcesz kupić bilet?");
        System.out.println("1 Queen");
        System.out.println("2 Dawid Podsiadło");
        System.out.println("3 Polska - Francja");
        String eventName = "";
        switch (scanner.nextInt()) {
            case 1: {
                eventName = "Queen";
                break;
            }
            case 2: {
                eventName = "Dawid Podsiadło";
                break;
            }
            case 3: {
                eventName = "Polska - Francja";
            }
        }
        System.out.println("Jaki typ biletu chcesz kupic?");
        System.out.println("1 Bilet internetowy");
        System.out.println("2 Bilet standardowy");
        System.out.println("3 Bilet prezentowy");
        String ticketType = "";
        switch (scanner.nextInt()) {
            case 1: {
                ticketType = "bilet internetowy";
                break;
            }
            case 2: {
                ticketType = "bilet standardowy";
                break;
            }
            case 3: {
                ticketType = "bilet prezentowy";
                break;
            }
        }
        double price;
        switch (eventName) {
            case "Queen": {
                price = 350;
                break;
            }
            case "Dawid Podsiadło": {
                price = 250;
                break;
            }
            case "Polska - Francja": {
                price = 600;
                break;
            }
            default: {
                price = 0;
            }
        }
        System.out.println("Czy posiadasz kod rabatowy?");
        System.out.println("1 Tak zniżka 10%");
        System.out.println("2 Tak zniżka 15%");
        System.out.println("3 Nie, nie posiadam");
        double discount;
        switch (scanner.nextInt()) {
            case 1: {
                discount = 0.1;
                break;
            }
            case 2: {
                discount = 0.15;
                break;
            }
            case 3: {
                discount = 0;
                break;
            }
            default: {
                discount = 0;
            }
        }
        Adress adress = new Adress("Wrocław Tarczyński Arena", "Aleja Śląska",
                1, "Wrocław", "54-118");

        return new Ticket(eventName, adress, ticketType, price, discount);
    }
}
