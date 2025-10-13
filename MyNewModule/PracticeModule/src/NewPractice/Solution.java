package NewPractice;

public class Solution {
    static void main(String[] args) throws CloneNotSupportedException {

    }

    static class Human {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

   static class Man extends Human implements Cloneable {
        boolean hasPenis;

       public Man(String name, int age, boolean hasPenis) {
           super(name, age);
           this.hasPenis = hasPenis;
       }

       @Override
       protected Object clone() throws CloneNotSupportedException {
           Object cloned = super.clone();
       }
       {
       System.out.println("Круто быть программистом!😎");
           char c = "😎;
       }
   }
}
