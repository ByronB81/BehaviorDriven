public class AniApp {
  public static void main(String[] args) {

    Animals dog = new Animals("Toby","Jane", 5, "Collie", "M");
    Animals cat = new Animals("Patches", "Bess", 9, "Calico", "F");
    Animals lizard = new Animals("Izzy", "Bucky", 3, "Iguana", "F");
    Animals hamster = new Animals("Fred", "Sarah", 1, "Hamster", "M");

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
  }
}
