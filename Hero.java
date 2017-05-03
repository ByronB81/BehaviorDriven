class Hero {
  public String name;
  public int age;
  public boolean good;
  public String home;
  public int price;

  // public Hero(String name, int age, boolean good, String home, int price){
  //   name = name;
  //   age = age;
  //   good = good;
  //   home = home;
  //   price = price;
  // }

  public boolean afford(int max) {
    return (price <= max);
  }
}
