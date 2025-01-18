package NewPractice;

public abstract class DrinkMaker {
   abstract void getRightCup();
   abstract void putIngredient();
   abstract void pour();

   void makerDrink() {
       getRightCup();
       putIngredient();
       pour();
   }
}
