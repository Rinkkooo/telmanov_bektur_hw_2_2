public class Pubg extends Games{

    private int team;
    public Pubg(String name, int year, String genre, int team) {
        super(name, year, genre);
        this.team = team;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Количество игроков сквада: " + team);
    }


}
