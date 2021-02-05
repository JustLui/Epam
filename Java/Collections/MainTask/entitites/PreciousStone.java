package entitites;

abstract public class PreciousStone extends Stone {
    public PreciousStone(String name, int transparency, int hardness, int weight, StoneColor color) {
        super(name, transparency, hardness, weight,true,color);
    }
}
