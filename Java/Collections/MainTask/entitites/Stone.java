package entitites;

abstract public class Stone {
     protected int transparency;
     protected boolean isPrecious;
     protected int hardness;
     String name;
     int price;
     int weight;
     StoneColor color;

    public Stone(String name, int transparency, int hardness, int weight, boolean isPrecious, StoneColor color){
        this.hardness = hardness;
        this.transparency = transparency;
        this.weight = weight;
        this.isPrecious = isPrecious;
        this.color = color;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public int getTransparency() {
        return transparency;
    }

    public StoneColor getColor() {
        return color;
    }

    public int getPrice() {
        if (isPrecious) {
            this.price = (this.transparency * 430) + (this.hardness * 256) + (this.weight * 8);
        }
        else {
            this.price = (this.transparency * 320) + (this.hardness * 198) + (this.weight * 4);

        }
            return this.price;
        }

    @Override
    public String toString() {
        return  "Stone name: " + name +
                "  Price: " + price +
                "  Weight: " + weight +
                "  Transparency: " + transparency +
                "  Hardness: " + hardness +
                "  Color: " + color +
                "  Type of stone: " + (this.isPrecious ? "PreciousStone" : "Semi-Precious Stone");
    }
}
