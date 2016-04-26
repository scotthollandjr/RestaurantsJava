public class Restaurants {
  private String mName;
  private String mDish;
  private String mRating;

  public  Restaurants(String name, String dish, String rating) {
    mName = name;
    mDish = dish;
    mRating = rating;
  }

  public String getName() {
    return mName;
  }

  public String getDish() {
    return mDish;
  }

  public String getRating() {
    return mRating;
  }
//   public String[] getUserInfo() {
//     String[] infoArray = {mName, mDish, mRating};
//     return infoArray;
//   }

}
