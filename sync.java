import java.util.*;
class table
{
  synchronized void print(int n)
  {
    for(int i=1;i<=5;i++)
    {
      System.out.println(n*i);
    }
  }

}
class thread1 extends Thread{
  table t;
  int n;
  thread1(table t)
  {
    this.t=t;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
  }
  public void run()
  {
    t.print(n);
  }
}
class sync
{
  public static void main(String[] args)
  {
       table t=new table();
       thread1 t1=new thread1(t);
       thread1 t2=new thread1(t);
       t1.start();
       t2.start();
  }
}
