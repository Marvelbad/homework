package com.mypractice.path_update;

public class Replace {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk13) {
        int index = path.indexOf("jdk"); //9
        int indexSlash = path.indexOf("/", index); //15

        String pathOne = path.substring(0, index); // "/usr/java/"
        String pathTwo = path.substring(indexSlash); // "/bin/"

        return pathOne + jdk13 + pathTwo;
    }
}
