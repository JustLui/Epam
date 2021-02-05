package entitites;

abstract public class SemiPreciousStones extends Stone {
    public SemiPreciousStones(String name, int transparency, int hardness, int weight, StoneColor color) {
        super(name, transparency, hardness, weight,false, color);
    }
}
