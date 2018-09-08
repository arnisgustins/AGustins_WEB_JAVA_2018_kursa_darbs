package general;

import lombok.Data;

@Data
public class Flight {
    private String departure;
    private String destination;
    private String flightClass;
    private String flightType;
    private String departureDate;
    private String arrivalDate;
    private int adultAmount;
    private int childrenAmount;
    private int infantAmount;

    public Flight() {
    }
}
