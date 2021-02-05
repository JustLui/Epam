package entitites;

public class Chrysoberyl extends Corundum {
    private static final int CHRYSOBELRYL_TRANSPARENCY = 1;
    private static final StoneColor COLOR = StoneColor.ORANGE;
    private static final String CHRYSOBELRYL_NAME = "CHRYSOBELRYL";

    public Chrysoberyl(int weight) {
        super(CHRYSOBELRYL_NAME, CHRYSOBELRYL_TRANSPARENCY,weight, COLOR);
    }
}
