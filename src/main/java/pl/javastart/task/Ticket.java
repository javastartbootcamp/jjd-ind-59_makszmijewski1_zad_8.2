package pl.javastart.task;

public class Ticket {
    public static final String TYPE_INTERNET = "bilet internetowy";
    public static final String TYPE_STANDARD = "bilet standardowy";
    public static final String TYPE_GIFT = "bilet prezentowy";

    private static int counter = 1;
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
        this.idNumber = counter;
        counter++;
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
