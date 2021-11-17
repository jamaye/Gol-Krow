/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workhours;
import java.io.*;
import java.time.Month;
/**
 *
 * @author syjan
 */
public class Shift implements Serializable{
    private int month; 
    private int day;
    private int year;
    private double hours;

    public Shift(int m, int d, int y, double h){
        this.month = m;
        this.day = d;
        this.year = y;
        this.hours = h;
    }
    
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    public void printShift(){
	System.out.printf("Month: %2s \nDay: %4d \nYear: %6d \nHours: %4.1f \n\n", Month.of(month).name(), day, year, hours/*, dayOfWeek*/);
    }
}
