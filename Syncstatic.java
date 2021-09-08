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
class Counter{
    static int count;
    synchronized static  void increment(){ //it means only on thread can execute this method at a tym so if t1 is executing t2 wont intefere viceversa
      
            System.out.println("Count"+ (++count));
    }
}
 class Ex1 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"is running");
        for(int i=0;i<5;i++){
          Counter.increment(); 
        }
    }
}
 class Ex2 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"is running");
        for(int i=0;i<5;i++){
          Counter.increment(); 
        }
    }
}
 class Ex3 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"is running");
        for(int i=0;i<5;i++){
          Counter.increment(); 
        }
    }
}
 class Ex4 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+"is running");
        for(int i=0;i<5;i++){
          Counter.increment(); 
        }
    }
}
public class  Syncstatic
{
	public static void main(String[] args)throws Exception {
	    Ex1 t1 =new Ex1();
	    Ex2 t2=new Ex2();
	    Ex3 t3=new Ex3();
	    Ex4 t4=new Ex4();
	   t1.start();
	   t2.start();
	   t3.start();
	   t4.start();
	}
}

