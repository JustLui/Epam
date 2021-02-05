package entitites;

public class Rhinestone extends Quartz {
    private static final int RHINESTONE_TRANSPARENCY = 9;
    private static final StoneColor COLOR = StoneColor.BEIGE;
    private static final String RHINESTONE_NAME = "RHINESTONE";

    public Rhinestone(int weight) {
        super(RHINESTONE_NAME, RHINESTONE_TRANSPARENCY, weight, COLOR);
    }
}
