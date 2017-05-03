public class HeroApp{
  public static void main(String[] args) {

    Hero dc1 = new Hero();
      dc1.name = "Batman";
      dc1.age = 42;
      dc1.good = true;
      dc1.home = "Gotham City";

    Hero dc2 = new Hero();
      dc2.name = "Superman";
      dc2.age = 38;
      dc2.good = true;
      dc2.home = "Metropolis";

    Hero dc3 = new Hero();
      dc3.name = "Joker";
      dc3.age = 51;
      dc3.good = false;
      dc3.home = "Gotham City";

    Hero mv1 = new Hero();
      mv1.name = "Wolverine";
      mv1.age = 85;
      mv1.good = true;
      mv1.home = "New York";

    Hero mv2 = new Hero();
      mv2.name = "Deadpool";
      mv2.age = 32;
      mv2.good = true;
      mv2.home = "Yonkers";

    Hero mv3 = new Hero();
      mv3.name = "Punisher";
      mv3.age = 34;
      mv3.good = false;
      mv3.home = "Hell's Kitchen";

    Hero[] allHeroes = {dc1,dc2,dc3, mv1,mv2,mv3};
    for (Integer x = 0; x < allHeroes.length; x++){
      System.out.println("-------------------------");
      System.out.println();
      System.out.println("I know of a guy named " + allHeroes[x].name + " from " + allHeroes[x].home + ", he looks to be about " + allHeroes[x].age + " years old");
      System.out.println();

      if (allHeroes[x].good == true) {
        System.out.println("and I'm pretty sure he's a good guy!");
        System.out.println();
        System.out.println("________________________");
      } else {
        System.out.println("but he doesn't sound like a very nice dude...");
        System.out.println();
        System.out.println("________________________");
      }
    }
    // System.out.println(allHeroes[1].name);
  }
}
