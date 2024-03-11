public abstract class Games implements Printable {
    private String name;
    private int year;
    private String genre;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public Games(String name, int year, String genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public void print() {
        System.out.println("Название игры: " + getName() + "\nГод выпуска: " + getYear() + "\nЖанр: " + getGenre());
    }
}
