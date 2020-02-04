package attractions;

import behaviours.IReviewed;
import people.Visitor;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return 4.50;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge() < 12){
            return defaultPrice()*0.5;
        } else {
            return defaultPrice();
        }
    }
}
