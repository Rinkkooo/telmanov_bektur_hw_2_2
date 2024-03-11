public class Main {

    public static String pubg = "Pubg";
    public static String counterStrike = "CounterStrike";
    public static String dota = "Dota2";

    public static Games createObject(String className){

        switch (className){
            case "Pubg":
                return new Pubg("PUBG: BATTLEGROUNDS", 2017, "arcade shooter", 4);
            case "Dota2":
                return new Dota2("Defence of the Ancient", 2013, "MOBA", 120);
            case "CounterStrike":
                return new CounterStrike("Counter Strike", 2012, "shooter", "Counter Terrorist");
        }
        return null;
    }

    public static void main(String[] args) {
      //  pubg.print();
        Games pubgGame = createObject(pubg);
        Games dotaGame = createObject(dota);
        Games csGame = createObject(counterStrike);
        Printable[] printable = {pubgGame, dotaGame, csGame};
        for (int i = 0; i < printable.length; i++) {
            printable[i].print();
        }


        }

    }
