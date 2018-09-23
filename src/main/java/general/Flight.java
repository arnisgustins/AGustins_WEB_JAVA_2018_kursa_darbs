package general;

import lombok.Data;

@Data
public class Flight {
    private String departure;
    private String destination;
    private String flightClass;
    private String flightType;
    private String departureDate;
    private String returnDate;
    private String adultAmount;
    private String childrenAmount;
    private String infantAmount;

    public Flight() {
    }
}
