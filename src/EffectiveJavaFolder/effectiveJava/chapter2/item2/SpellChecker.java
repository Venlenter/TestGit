package EffectiveJavaFolder.effectiveJava.chapter2.item2;

import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

public class SpellChecker {
    private final Map<String, String> dictionary;
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    private SpellChecker(Map<String, String> dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (long i=0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000.0);
    }
    static boolean isRomanNumberal(String s) {
//        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
//                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
        return ROMAN.matcher(s).matches();
    }
}
