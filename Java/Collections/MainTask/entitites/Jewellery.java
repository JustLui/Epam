package entitites;
import java.util.ArrayList;
import java.util.List;

public class Jewellery {
    List<Stone> stones;

    public Jewellery() {
    stones = getJewellSet();
    }

    public List<Stone> getStones() {
        return stones;
    }

    private List<Stone> getJewellSet () {
        List<Stone> jewellery = new ArrayList<>();
        jewellery.add(StoneFactory.getAmethystRandomWeight());
        jewellery.add(StoneFactory.getAmetrineRandomWeight());
        jewellery.add(StoneFactory.getChrysoberylRandomWeight());
        jewellery.add(StoneFactory.getRhinestoneRandomWeight());
        jewellery.add(StoneFactory.getRubyRandomWeight());
        jewellery.add(StoneFactory.getSapphireRandomWeight());
        jewellery.add(StoneFactory.getAmethystRandomWeight());
        jewellery.add(StoneFactory.getAmetrineRandomWeight());
        jewellery.add(StoneFactory.getChrysoberylRandomWeight());
        jewellery.add(StoneFactory.getRhinestoneRandomWeight());
        jewellery.add(StoneFactory.getRubyRandomWeight());
        jewellery.add(StoneFactory.getSapphireRandomWeight());
        return jewellery;
    }
}
