/*package com.britishgas;

import java.util.stream.Stream;

import com.google.common.base.Functions;

public class AnagramDemo {

	public static void main(String[] args) {
		StringBuilder b = new StringBuilder(word);
		for (int i = b.length() - 1; i > 0; i--)
		    if (b.charAt(i - 1) < b.charAt(i)) {
		        int j = b.length() - 1;
		        while (b.charAt(i - 1) > b.charAt(j))
		            j--;
		        swap(b, i - 1, j);
		        reverse(b, i);
		        return new Word(b.toString());
		    }
		return new Word(b.reverse().toString());
	}
	
	public static Stream<WordSequence> anagram(Stream<WordSequence> data, Object[] parameters) {
	    return data.unordered().flatMap(WordSequence.forEachWord(Functions::allAnagrams)).distinct();
	}

	private static Stream<Word> allAnagrams(Word data) {
	    if (data.length() <= 1)
	        return Stream.of(data);
	    Stream<Word> ret = Stream.empty();
	    for (int i = 0; i < data.length(); i++) {
	        char ch = data.charAt(i);
	        String rest = new StringBuilder(data).deleteCharAt(i).toString();
	        ret = Stream.concat(ret, allAnagrams(new Word(rest)).map(word -> new Word(ch + word.toString()))).unordered();
	    }
	    return ret;
	}

}
*/