package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowed(Visitor visitor){
        return visitor.getAge() > 18;
    }

    @Override
    public int getRating() {
        return 0;
    }
}
