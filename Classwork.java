public class Classwork
{
  public static void main(String[] args)
  {
    // test your code here
    System.out.println(firstLastN("dicionary"));
    System.out.println("hello world");
    s.sybstring(2, s.length());
  }

  // write solutions to problems below
  public static String delEnd(String s, int n)
  {
    int stoppingPoint = s.length() - n;
    String output = s.substring(0, stoppingPoint);
    return output;
  }

  public static String firstLastN(String word, int n)
  {
    String output = new String();
    String firstN = word.substring(0, n);
    int indexOfNToLast = word.length() - n;
    String lastN = word.substring(indexOfNToLast);
    output = firstN + lastN;
    return output;

  }
}
