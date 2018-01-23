package com.britishgas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {
    private static String canonicalize(String s) {
        return Stream.of(s.split("")).sorted().collect(Collectors.joining());
    }

    public static Map<String, Set<String>> getAnagrams(Reader reader) {
        Map<String, List<String>> map = new BufferedReader(reader).lines()
           .flatMap(Pattern.compile("\\W+")::splitAsStream)
           .distinct() // remove repeating words
           .collect(Collectors.groupingBy(Anagrams::canonicalize));
        return map.values().stream()
           .filter(list -> list.size() > 1)
           .collect(Collectors.toMap(list -> list.get(0), 
                                     list -> new TreeSet<>(list.subList(1, list.size()))));
    }

    public static void main(String[] args) throws IOException {
    	getAnagrams(new InputStreamReader(new URL("http://static.abscond.org/wordlist.txt").openStream(), StandardCharsets.UTF_8)).values().forEach(System.out::println);
       
    }
}
