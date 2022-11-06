package LiskovSubstitutionPrinciple.CorrectApproach;

import java.util.ArrayList;
import java.util.List;

public class BirdActivityTracker {
    public void trackFlyingActivity() {
        List<FlyingBird> birds = new ArrayList<>();
        FlyingBird pigeon = new Pigeon();
        birds.add(pigeon);
        birds.forEach(FlyingBird::fly);
    }
}
