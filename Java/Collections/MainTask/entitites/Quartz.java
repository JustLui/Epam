package entitites;

abstract public class Quartz extends SemiPreciousStones {
    private static final int QUARTZ_HARDNESS = 7;

    public Quartz(String name, int transparency,int weight, StoneColor color) {
        super(name, transparency, QUARTZ_HARDNESS, weight,color);
    }
}
