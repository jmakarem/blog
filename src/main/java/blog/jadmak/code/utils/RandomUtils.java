package blog.jadmak.code.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Generates a list of random strings.
 *
 * @param size   The length of each random string.
 * @param number The number of random strings to generate.
 * @return A list containing randomly generated strings.
 */
public class RandomUtils {
    public static List<String> generateRandomStrings(int size,int number){
        int leftLimit = 'a';
        int rightLimit = 'z';
        Random random = new Random();

        return new ArrayList<>(IntStream.range(0,number).mapToObj(it -> random.ints(leftLimit, rightLimit + 1)
                .limit(size)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString()).toList());
    }
}
