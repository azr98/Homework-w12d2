import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> stallsAndAttractions;


    public ThemePark(ArrayList<IReviewed> stallsAndAttractions, int vistCount) {
        this.stallsAndAttractions = stallsAndAttractions;
    }

    public ThemePark(ArrayList<IReviewed> stallsAndAttractions) {
        this.stallsAndAttractions = stallsAndAttractions;
    }

    public ArrayList<IReviewed> getAlReviewed() {
        return stallsAndAttractions;
    }

    public void visit(Visitor visitor, Attraction attraction){
        int currentVisitCount = attraction.getVisitCount();
        int newVisitCount = currentVisitCount + 1;
        attraction.setVisitCount(newVisitCount);
        visitor.addVisitedAttraction(attraction);
    }
}
