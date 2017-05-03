import java.io.Console;

public class AniApp {
  public static void main(String[] args) {
    Console console = System.console();

    Animals dog = new Animals("Toby","Jane", 5, "Collie", "M", false);
    Animals cat = new Animals("Patches", "Bess", 9, "Calico", "F", false);
    Animals lizard = new Animals("Izzy", "Bucky", 3, "Iguana", "F", false);
    Animals hamster = new Animals("Fred", "Sarah", 1, "Hamster", "M", false);

   Animals[] allAnimals = {dog, cat, lizard, hamster};

    System.out.println();
    System.out.println("These are all of my friends pets:");
    for (Animals animal : allAnimals) {
        System.out.println("--------------");
        System.out.print(animal.ownerName + "'s pet ");
        System.out.println(animal.animalName);
        if (animal.sex == "F") {
          System.out.print("She's a " + animal.age);
        } else if (animal.sex == "M") {
          System.out.print("He's a " + animal.age);
        }
        if (animal.age > 1) {
          System.out.println(" year old " + animal.breed + "!");
        } else {
          System.out.println(" year old " + animal.breed + "!");
        }


    }

    System.out.println();

  // public static void gradeIt(boolean cute) {
  //   System.out.println("Does that sound cute to you?");
  //   String affirm = console.readLine();
  //   if (affirm == "yes") {
  //     animal.aCute = true;
  //     System.out.println("It is " + animal.aCute + " that it is cute.");
  //   }

  }
}
