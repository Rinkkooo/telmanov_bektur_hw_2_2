public class Dota2 extends Games{

    private int heroes;
    public Dota2(String name, int year, String genre, int heroes) {
        super(name, year, genre);
        this.heroes = heroes;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Количество героев: " + heroes);
    }
}
