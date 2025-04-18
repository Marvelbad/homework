package Coding;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try {
            File myFile = File.createTempFile("DataBase.txt", null);
            try (OutputStream outputStream = new FileOutputStream(myFile);
                 InputStream inputStream = new FileInputStream(myFile)) {

                JavaRush javaRush = new JavaRush();
                User user = new User();
                user.setFirstName("Alex");
                user.setLastName("Spiridonov");
                user.setBirthDate(new Date(1987, Calendar.FEBRUARY, 5));
                user.setMale(true);
                user.setCountry(User.Country.UKRAINE);

                javaRush.users.add(user);

                javaRush.save(outputStream);
                outputStream.flush();
            }


        } catch (IOException e) {
            System.out.println("Oops, something is wrong with my file");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {

        }
    }
}