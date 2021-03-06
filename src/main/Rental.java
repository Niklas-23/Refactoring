package main;

public class Rental {

    private final Movie movie;
    private final int daysRented;

    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getFrequentRenterPoints(){
        return movie.getFrequenterPoints(daysRented);
    }

    public double getCharge(){
        return movie.getCharge(daysRented);
    }
}