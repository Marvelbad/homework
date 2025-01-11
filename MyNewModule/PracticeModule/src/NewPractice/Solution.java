package NewPractice;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key;
        while ((key = reader.readLine()) != null) {
            Movie movie = MovieFactory.getMovie(key);
            if (movie == null) {
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
    }

    static class MovieFactory {
        private static final Map<String, Class<? extends Movie>> movieMap = new HashMap<>();

        static {
            movieMap.put("soapOpera", SoapOpera.class);
            movieMap.put("thriller", Thriller.class);
            movieMap.put("cartoon", Cartoon.class);
        }

        static Movie getMovie(String key) {
            Class<? extends Movie> movieClass = movieMap.get(key);
            if (movieClass != null) {
                try {
                    return movieClass.getDeclaredConstructor().newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }


    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}