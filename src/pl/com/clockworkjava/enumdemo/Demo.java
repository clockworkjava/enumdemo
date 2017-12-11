package pl.com.clockworkjava.enumdemo;

import java.util.EnumSet;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {

        Season season = Season.SUMMER;

        System.out.println(season.getTranslation("pl"));

        season.addTranslation("de","Sommerzeit");

        System.out.println(season.getTranslation("de"));

        System.out.println(Season.WINTER.getTranslation("de"));

        Set<Season> seasons = EnumSet.of(Season.SUMMER, Season.WINTER, Season.SPRING, Season.AUTUMN);

        seasons.stream().forEach(s -> System.out.println(s.forcastWeather()));

        seasons.stream().forEach(s -> System.out.println(s.randomThing()));


    }
}
