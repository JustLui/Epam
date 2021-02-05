package entitites;

abstract public class Corundum extends PreciousStone {
    private static final int CORUNDUM_HARDNESS = 8;

    public Corundum(String name, int transparency,int weight, StoneColor color) {
        super(name, transparency, CORUNDUM_HARDNESS, weight,color);
    }
}
