public class Friends {
  public static void main(String[] args) {

    People p1 = new People("Byron", 36, "Los Angeles");

    People[] friendList = {p1};

    for (People friend : friendList){
      System.out.println(friend.pName);
    }

    System.out.println("hmmmm");
  }
}
