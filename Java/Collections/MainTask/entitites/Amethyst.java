package entitites;

public class Amethyst extends Quartz {
    private static final int AMETHYST_TRANSPARENCY = 2;
    private static final StoneColor COLOR = StoneColor.GREEN;
    private static final String AMETHYST_NAME = "AMETHYST";

    public Amethyst(int weight) {
        super(AMETHYST_NAME,AMETHYST_TRANSPARENCY,weight,COLOR);
    }
}
