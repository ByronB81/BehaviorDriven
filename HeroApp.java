import java.io.Console;

public class HeroApp{
  public static void main(String[] args) {
    Console console = System.console();

    Hero dc1 = new Hero("Batman", 42, true, "Gotham City", 100);
    Hero dc2 = new Hero("Superman", 38, true, "Metropolis", 65);
    Hero dc3 = new Hero("Joker", 51, false, "Gotham City", 25);
    Hero mv1 = new Hero("Wolverine", 85, true, "New York City", 55);
    Hero mv2 = new Hero("Deadpool", 32, true, "New York", 10);
    Hero mv3 = new Hero("Punisher", 36, false, "Hell's Kitchen", 35);

  Hero[] allHeroes = {dc1,dc2,dc3, mv1,mv2,mv3};

    System.out.println("Okay friend, ya need a hero but how much can you pay?");
    String strNum = console.readLine();
    Integer max = Integer.parseInt(strNum);
    System.out.println("Okay let's see what we got...");
    System.out.println();

    for (Hero oneHero : allHeroes){


       if (oneHero.afford(max)) {
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("I know of a guy named " + oneHero.hName + " from " + oneHero.hHome + ", he looks to be about " + oneHero.hAge + " years old.");
        System.out.println();
        System.out.println("He costs " + oneHero.hPrice + " dollars.");
        System.out.println();

        if (oneHero.hGood == true) {
          System.out.println("and I'm pretty sure he's a good guy!");
          System.out.println();
          System.out.println("_________________________");
        } else {
          System.out.println("but he doesn't sound like a very nice dude...");
          System.out.println();
          System.out.println("_________________________");
        }
      }
    }

  }
}
