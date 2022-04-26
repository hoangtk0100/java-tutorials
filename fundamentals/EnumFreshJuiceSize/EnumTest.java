class FreshJuice {
  enum CupSize {SMALL, MEDIUM, LARGE}
  CupSize size;
}

public class EnumTest {

  public static void main(String args[]) {
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.CupSize.MEDIUM;
    System.out.println("Size: " + juice.size);
  }
}
