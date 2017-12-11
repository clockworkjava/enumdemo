package pl.com.clockworkjava.enumdemo;

import java.util.HashMap;
import java.util.Map;

/* final static public enum Season implements Forecastable, Serializable, Comparable */
public enum Season implements Forecastable  {

    SPRING("pl", "Wiosna") {

        @Override
        public String randomThing() {
          return "Random spring thing";
        }
    },
    SUMMER("pl", "Lato") {

        @Override
        public String randomThing() {
            return "Random summe thing";
        }

        @Override
        public String forcastWeather() {
            return "Slonecznie";
        }
    },
    AUTUMN("pl", "Jesien") {
        @Override
        public String randomThing() {
            return "Random autumn thing";
        }
    },
    WINTER("pl", "Zima"){
        @Override
        public String forcastWeather() {
            return "Snieg";
        }

        @Override
        public String randomThing() {
            return "Random winter thing";
        }
    };

    private Map<String,String> translations = new HashMap<>();

    private Season(String language, String translation) {
        addTranslation(language, translation);
    }

    public String getTranslation(String language) {
        return this.translations.get(language);
    }

    public void addTranslation(String language, String translation) {
        translations.put(language,translation);
    }

    public String forcastWeather() {
        return "Deszczowo";
    }

    public abstract String randomThing();
}
