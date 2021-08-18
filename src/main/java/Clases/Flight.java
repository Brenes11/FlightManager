package Clases;

import lombok.Getter;
import lombok.Setter;

public class Flight {
    @Getter @Setter
    public int idFlight;
    @Getter @Setter
    public String code;
    @Getter @Setter
    public String departureCity;
    @Getter @Setter
    public String arrivalCity;
    @Getter @Setter
    public String status;
}
