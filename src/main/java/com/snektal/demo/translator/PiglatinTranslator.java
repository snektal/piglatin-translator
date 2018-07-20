package com.snektal.demo.translator;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PiglatinTranslator {

    static final String SPACE_DELIMITER = " ";


    public String translate(String input) {

        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(translateAWord(words[i]));
        }
        return sb.toString();
    }

    public String translateJava8Style(String input) {
        return Stream.of(input.split(SPACE_DELIMITER)).map(i-> translateAWord(i)).collect(Collectors.joining(SPACE_DELIMITER));
    }

    private String translateAWord(String word) {
        String translated;
        boolean isFirstLetterCapital = isFirstLetterCapital(word);

        if (isStartWithConsonant(word)) {
            translated = word.substring(1).concat(String.valueOf(word.charAt(0))).concat("ay");
        } else {
            translated = word.concat("ay");
        }
        return capitalizeFirstLetter(translated, isFirstLetterCapital);
    }

    private String capitalizeFirstLetter(String input, boolean isFirstLetterCapital) {

        if (!isFirstLetterCapital) {
            return input;
        }
        String firstCapital = String.valueOf(input.charAt(0)).toUpperCase();
        return firstCapital.concat(input.substring(1).toLowerCase());

    }

    private boolean isFirstLetterCapital(String word) {

        String firstCapital = String.valueOf(word.charAt(0)).toUpperCase();
        String firstActual = String.valueOf(word.charAt(0));
        return firstCapital.equals(firstActual);

    }

    private boolean isStartWithConsonant(String word) {

        return !(word.startsWith("a") || word.startsWith("o") ||
                word.startsWith("i") ||
                word.startsWith("e") ||
                word.startsWith("u"));
    }
}
