package pl.javastart.task;

public class Ticket {
    private static int COUNTER = 1;
    private String eventName;
    private Adress adress;
    private String ticketType;
    private double basicPrice;
    private double discount;
    private int idNumber;

    public Ticket(String eventName, Adress adress, String ticketType, double basicPrice, double discount) {
        this.eventName = eventName;
        this.adress = adress;
        this.ticketType = ticketType;
        this.basicPrice = basicPrice;
        this.discount = discount;
        this.idNumber = COUNTER;
        COUNTER++;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public String getTicketType() {
        return ticketType;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "eventName='" + eventName + '\'' +
                ", adress=" + adress +
                ", ticketType='" + ticketType + '\'' +
                ", basicPrice=" + basicPrice +
                ", discount=" + discount +
                ", idNumber=" + idNumber +
                '}';
    }
}
