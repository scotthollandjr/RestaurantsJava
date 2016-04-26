public class Restaurants {
  private String mName;
  private String mDish;
  private String mRating;

  public  Restaurants(String name, String dish, String rating) {
    mName = name;
    mDish = dish;
    mRating = rating;
  }

  public String[] getUserInfo() {
    String[] infoArray = {mName, mDish, mRating};
    return infoArray;
  }
}
