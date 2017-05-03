class Hero {
  public String name;
  public int age;
  public boolean good;
  public String home;
  public int price;

  public boolean afford(int max) {
    return (price <= max);
  }
}
