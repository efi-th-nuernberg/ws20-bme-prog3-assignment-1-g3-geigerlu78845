class Zahlenfilter {

  public static void main(String[] args) {
    for(int i = 1; i <= 200; i++)
    {
      int result = i + (i-1); //berechnet Addition des Vorgängers mit der aktuellen Zahl

      if(i%5 == 0 || i%10 == 9 || result%3 == 0) //Abfrage ob Sonderfälle vorhanden
      {
        if(i%5 == 0)
        {
          System.out.println("i = " +i+ " - ZAHL ist durch 5 teilbar!");
        }
        if (i%10 == 9)
        {
          System.out.println("i = " +i+ " - ZAHL endet auf 9!");
        }
        if (result%3 == 0)
        {
        System.out.println("i = " +i+ " - ZAHL und VORGÄNGER addiert ergeben " +result+ " und " +result+ " ist durch 3 teilbar");
        }
      }
      else //keine Sonderfälle
      {
        System.out.println("i = " + i);
      }
    }  
  }
}