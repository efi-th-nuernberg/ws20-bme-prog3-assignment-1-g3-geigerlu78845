class Zahlenfilter {

  public static void main(String[] args) {
    for(int i = 1; i <= 200; i++)
    {
      if(i%5 == 0)
      {
        System.out.println("i = " +i+ " - ZAHL ist durch 5 teilbar!");
      }
      else if (i%10 == 9)
      {
        System.out.println("i = " +i+ " - ZAHL endet auf 9!");
      }
      else if ((i + (i-1))%3 == 0)
      {
        System.out.println("i = " +i+ " - ZAHL und VORGÄNGER addiert ergeben " +(i+(i-1))+ " und " +(i+(i-1))+ " ist durch 3 teilbar");
      }
      else
      {
        System.out.println("i = " + i);
      }
    }  
  }
}