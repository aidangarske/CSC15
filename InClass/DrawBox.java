public class DrawBox
{
   public static void main(String[] args)
   {
      /* Calls to "method" */
      drawBox();
      drawTriangle();
      drawBox();
      drawTriangle();
      drawTwoTriangles();
   }

   /* Draws box */
   public static void drawBox()
   {
      System.out.println("*******");
      System.out.println("*******");
      System.out.println("*******");
      System.out.println("*******\n");
   }

   /* Draws triangle */
   public static void drawTriangle()
   {
      System.out.println("    *      ");
      System.out.println("   * *     ");
      System.out.println("  *   *    ");
      System.out.println(" *     *   ");
      System.out.println("* * * * *\n");
   }

   /* Draws two triangles */
   public static void drawTwoTriangles()
   {
      System.out.println("    *           *      ");
      System.out.println("   * *         * *     ");
      System.out.println("  *   *       *   *    ");
      System.out.println(" *     *     *     *   ");
      System.out.println("* * * * *   * * * * * \n");
   }
}
