package com.mypractice.path_update;

public class replace_2 {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        String newPath = path.replace("1.8", "-13");
        return newPath;
    }
}
