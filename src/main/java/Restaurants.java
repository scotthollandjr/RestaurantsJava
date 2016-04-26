public class Restaurants {
  private String mName;
  private String mDish;
  private String mRating;

  public Restaurant(String name, String dish, String rating) {
    mName = name;
    mDish = dish;
    mRating = rating;
  }

  public String[] getUserInfo() {
    String infoArray = new String();
    infoArray.add(mName);
    infoArray.add(mDish);
    infoArray.add(mRating);
    return infoArray;
  }
}
