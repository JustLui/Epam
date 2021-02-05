package entitites;

public class Ametrine extends Quartz {
    private static final int AMETRINE_TRANSPARENCY = 3;
    private static final StoneColor COLOR = StoneColor.MAGENTA;
    private static final String AMETRINE_NAME = "AMETRINE";

    public Ametrine(int weight) {
        super(AMETRINE_NAME,AMETRINE_TRANSPARENCY,weight,COLOR);
    }
}
