package LiskovSubstitutionPrinciple.WrongApproach;

import java.util.ArrayList;
import java.util.List;

public class BirdActivityTracker {
    public void trackFlyingActivity() {
        List<Bird> birds = new ArrayList<>();
        Bird pigeon = new Pigeon();
        Bird penguin = new Penguin();
        birds.add(penguin);
        birds.add(pigeon);
        birds.forEach(Bird::fly);
    }
}
