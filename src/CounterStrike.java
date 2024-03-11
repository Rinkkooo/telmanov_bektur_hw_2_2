public class CounterStrike extends Games{

    private String side;
    public CounterStrike(String name, int year, String genre, String side) {
        super(name, year, genre);
        this.side = side;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Сторона: " + side);
    }
}
