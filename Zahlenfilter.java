class Zahlenfilter {

  public static void main(String[] args) {
    for(int current = 1; current <= 200; current++)
    {
      if((result_dividable_by_three(current) || dividable_by_five(current) || ends_with_9(current)) == false) //Abfrage ob Sonderfälle vorhanden
      {
        System.out.println(current);
      }
    }  
  }

  private static boolean result_dividable_by_three(int current)
  {
    int previous_plus_current = current + (current-1);
    
    if(previous_plus_current%3 == 0)
    {
       System.out.println(current+ " - ZAHL und VORGÄNGER addiert ergeben " +previous_plus_current+ " und " +previous_plus_current+ " ist durch 3 teilbar");
      return true;
    }
    return false;
  }

  private static boolean dividable_by_five(int current){
    if(current%5 == 0) 
    {
      System.out.println(current+ " - ZAHL ist durch 5 teilbar!");
      return true;
    }
    return false;
  }

  private static boolean ends_with_9(int current){
    if (current%10 == 9)
        {
          System.out.println(current+ " - ZAHL endet auf 9!");
          return true;
        }
        return false;
  } 
}