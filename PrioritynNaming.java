/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Hii implements  Runnable{
    public void run(){
        for(int i=0;i<5;i++){
             System.out.println("hii --->"+Thread.currentThread().getPriority());
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
public class  PrioritiesnNaming
{
	public static void main(String[] args)throws Exception {
	   Hii obj1=new Hii();//obj1 is acts as thread now
	   Hello obj2=new Hello();//obj2 is acts as thread now
	   Thread t1=new Thread(obj1,"Hii thread");//obj1 is runnable 
	   Thread t2=new Thread(obj2,"Hello thread");
	   //t1.setName("hii thread");//change the name from thread-0 to hii thread
	   //t2.setName("hello thread");//change the name from thread-1 to hello thread
	   System.out.println(t1.getName());//we can get the name of the thread
	   System.out.println(t2.getName());
	   //System.out.println(t1.getPriority());//it will print the priority of  the thread
	   //System.out.println(t2.getPriority());//by deafult thread priority is 5
	   //range of thread is 1 to 5 
	   //10--->is highestpriority,,1-->is lowestPriority,5-->normal priority
	   //t1.setPriority(1);
	   //t2.setPriority(10);
	   //inbuilt constans are available
	   t1.setPriority(Thread.MIN_PRIORITY);
	   t2.setPriority(Thread.MAX_PRIORITY);
	   System.out.println(t1.getPriority());
	   System.out.println(t2.getPriority());
	   t1.start();
	   t2.start();
	   t1.join();
	   t2.join();
	  
	  System.out.println(t1.isAlive());//here t1 is died
	  System.out.println(t2.isAlive());//here t2 is died
	   System.out.println("bye");
	   
	}
}

