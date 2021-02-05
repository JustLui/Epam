package entitites;

public class Ruby extends Corundum {
    private static final int RUBY_TRANSPARENCY = 7;
    private static final StoneColor COLOR = StoneColor.RED;
    private static final String RUBY_NAME = "RUBY";

    public Ruby(int weight) {
        super(RUBY_NAME, RUBY_TRANSPARENCY,weight, COLOR);
    }
}
