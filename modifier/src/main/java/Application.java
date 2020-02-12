public class Application {

  public static void main(String[] args) {
      Student cindy = new Student("Cindy", 80);
      Student mary = new Student("Mary", 95);

      Teacher solider = new Teacher("Solider", cindy);
      Teacher bob = new Teacher("Bob", mary);

      solider.changeStuScore(5);
      bob.changeStuScore(5);

      solider.printDetail();
      System.out.println("================");
      bob.printDetail();
  }

}
