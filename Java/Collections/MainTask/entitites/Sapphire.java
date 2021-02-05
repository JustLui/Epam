package entitites;

public class Sapphire extends Corundum {
    private static final int SAPPHIRE_TRANSPARENCY = 8;
    private static final StoneColor COLOR = StoneColor.TURQUOISE;
    private static final String SAPPHIRE_NAME = "SAPPHIRE";

    public Sapphire(int weight) {
        super(SAPPHIRE_NAME, SAPPHIRE_TRANSPARENCY,weight, COLOR);
    }
}
