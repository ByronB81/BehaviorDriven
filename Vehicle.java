public class Vehicle {
  public int mYear;
  public String mBrand;
  public String mModel;
  public int mMiles;
  public int mPrice;

  public boolean worthbuying(int maxPrice) {
    return(mPrice < maxPrice);
  }
}
