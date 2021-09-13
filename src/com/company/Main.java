package com.company;// package com.company;
class myDateFormatter {
    public static String printAmerican(String date, int day, String month, int year) {
        String s = date + ", " + month + " " + day + " " + year;
        return s;
    }
    public static String printEuropean(String date, int day, String month, int year) {
        String s = date + " " + day + " " + month + " " + year;
        return s;
    }
    public static void main(String[] args) {
        String date = "Monday";
        int day = 6;
        String month = "September";
        int year = 2021;
        // System.out.println(date + ", " + month + " " + day + " " + year); // US
        // System.out.println(date + " " + day + " " + month + " " + year); //EU
        System.out.println(printAmerican(date,day,month,year));
        System.out.println(printEuropean(date,day,month,year));
    }
}
