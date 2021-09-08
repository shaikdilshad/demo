/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Hii implements  Runnable{
    public void run(){
        for(int i=0;i<5;i++){
             System.out.println("hii");
             try{
                 //Thread.sleep(100);
                 Thread.sleep(1000);
             }
             catch(Exception e){}
        }
       
    }
}
class Hello implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
             System.out.println("hello");
             try{
                 Thread.sleep(1000);
             }
             catch(Exception e){}
        }
    }
}
public class JoinIsAlive
{
	public static void main(String[] args)throws Exception {
	   Hii obj1=new Hii();//obj1 is acts as thread now
	   Hello obj2=new Hello();//obj2 is acts as thread now
	   Thread t1=new Thread(obj1);//obj1 is runnable 
	   Thread t2=new Thread(obj2);
	   t1.start();
	   t2.start();
	   //System.out.println(t1.isAlive());this t1 thread is alive here
	   t1.join();//make this threaf join again until it dies then only main thread thread willl execute
	   t2.join();
	   //after the join() both the threads are in dead state then only mian thread will execute
	  System.out.println(t1.isAlive());//here t1 is died
	  System.out.println(t2.isAlive());//here t2 is died
	   System.out.println("bye");
	   
	}
}
