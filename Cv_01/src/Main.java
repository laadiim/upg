import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    int w;
    Scanner scanner = new Scanner(System.in);
    if (args.length > 0)
    {
      w = Integer.parseInt(args[0]);
    }
    else
    {
      System.out.print("Zadej sirku: ");
      w = Integer.parseInt(scanner.nextLine());
    }
    int h = 2 * w/3;
    for (int y = 0; y <= h; y++)
    {
      for (int x = 0; x <= w; x++)
      {
        int p1 = h * x - w * y;
        int p2 = h * x + w * y - h * w;
        int k = (x - w / 2) * (x - w / 2) + (y - h / 2) * (y - h / 2) - 16;
        if (Math.abs(evalElipse(x, y, w/2, h/2, w/4, h/4)) < 0.4 ) {
          System.out.print("*");
        } else {
          System.out.print(".");
        }
      }
      System.out.println("");
    }
  }
  
  public static double evalElipse(int x, int y, int sx, int sy, int a, int b)
  {
    return ((Math.pow(x-sx, 2))/(Math.pow(a, 2)) - (Math.pow(y-sy, 2))/(Math.pow(b, 2)) - 1);
  }
}