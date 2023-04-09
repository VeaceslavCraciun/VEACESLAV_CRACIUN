package org.example.homework_nr_6;

public class Date {
    private Integer Day;
    private Integer Month;
    private Integer Year;

    public Date(Integer day, Integer month, Integer year) {
        Day = day;
        Month = month;
        Year = year;
    }

    public Integer getDay() {
        return Day;
    }

    public void setDay(Integer day) {
        if (day < 31 & day > 0)
        this.Day = day;
        else System.out.println("Invalid value of Day: " + day);

    }

    public Integer getMonth() {
        return Month;
    }

    public void setMonth(Integer month) {
        if (month <= 12 && month > 0)
            this.Month = month;
        else System.out.println("Invalid value of Month: " + month);
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        if (year >=0) this.Year = year;
        else System.out.println("Invalid value of Year" + year);
    }

    public void displayDate(){
        System.out.println(Day + "/" + Month + "/" + Year);
    }
}
