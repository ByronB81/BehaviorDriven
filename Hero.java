class Hero {
  public String hName;
  public int hAge;
  public boolean hGood;
  public String hHome;
  public int hPrice;

  public Hero(String name, int age, boolean good, String home, int price){
    hName = name;
    hAge = age;
    hGood = good;
    hHome = home;
    hPrice = price;
  }

  public boolean afford(int max) {
    return (hPrice <= max);
  }
}
