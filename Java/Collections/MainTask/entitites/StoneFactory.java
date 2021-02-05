package entitites;

public class StoneFactory {
        private static int getRandomWeight(){
            return 1 + (int)(Math.random() * 450);
        }

        public static Amethyst getAmethystRandomWeight(){
            return new Amethyst(getRandomWeight());
        }

        public static Ametrine getAmetrineRandomWeight(){
            return new Ametrine(getRandomWeight());
        }

        public static Chrysoberyl getChrysoberylRandomWeight(){
        return new Chrysoberyl(getRandomWeight());
        }

        public static Rhinestone getRhinestoneRandomWeight(){
        return new Rhinestone(getRandomWeight());
        }

        public static Ruby getRubyRandomWeight(){
        return new Ruby(getRandomWeight());
        }

        public static Sapphire getSapphireRandomWeight(){
        return new Sapphire(getRandomWeight());
        }
}


