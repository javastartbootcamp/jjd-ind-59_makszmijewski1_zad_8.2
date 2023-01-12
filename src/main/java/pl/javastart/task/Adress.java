package pl.javastart.task;

public class Adress {
    private String stadiumName;
    private String street;
    private int streetNumber;
    private String city;
    private String postCode;

    public Adress(String stadiumName, String street, int streetNumber, String city, String postCode) {
        this.stadiumName = stadiumName;
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "stadiumName='" + stadiumName + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
