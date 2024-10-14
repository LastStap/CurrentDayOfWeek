package org.example;

public class Main {

    public static void main(String[] args){

        daysOfWeek today = daysOfWeek.FRI;

        String currentDay = switch (today) {
            case MO -> {
                yield "Today is Monday";
            }
            case TUE -> {
                yield "Today is Tuesday";
            }
            case WED -> {
                yield "Today is Wednesday";
            }
            case THU -> {
                yield "Today is Thursday";
            }
            case FRI -> {
                yield "Today is Friday";
            }
            case SAT, SUN -> {
                yield "Today is Weekend";
            }
            };
        System.out.println(currentDay);
        }
    }