package web.model;

public class Car {
    private String series;
    private int number;
    private int year;

    public Car() {
    }

    public Car(String series, int number, int year) {
        this.series = series;
        this.number = number;
        this.year = year;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
