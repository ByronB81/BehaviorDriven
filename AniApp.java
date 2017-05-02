public class AniApp {
  public static void main(String[] args) {
    Animals dog = new Animals();
      dog.animalName = "Toby";
      dog.ownerName = "Jane";
      dog.age = 5;
      dog.breed = "Collie";
      dog.sex = "M";

    Animals cat = new Animals();
      cat.animalName = "Patches";
      cat.ownerName = "Bess";
      cat.age = 9;
      cat.breed = "Calico";
      cat.sex = "F";

    Animals lizard = new Animals();
      lizard.animalName = "Izzy";
      lizard.ownerName = "Bucky";
      lizard. age = 3;
      lizard.breed = "Iguana";
      lizard.sex = "F";

    Animals hamster = new Animals();
      hamster.animalName = "Fred";
      hamster.ownerName = "Sarah";
      hamster.age = 1;
      hamster.breed = "Brown";
      hamster.sex = "M";

    Animals[] allAnimals = {dog, cat, lizard, hamster};

    System.out.println();
    System.out.println("These are all of my friends pets:");
    for (Animals animal : allAnimals) {
        System.out.println("--------------");
        System.out.print(animal.ownerName + "'s pet ");
        System.out.println(animal.animalName);
        if (animal.sex == "F") {
          System.out.print("She's " + animal.age);
        } else if (animal.sex == "M") {
          System.out.print("He's " + animal.age);
        }
        if (animal.age > 1) {
          System.out.println(" years old!");
        } else {
          System.out.println(" year old!");
        }
    }
    System.out.println();
  }
}
