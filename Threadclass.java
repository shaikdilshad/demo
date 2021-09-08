/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Hii extends Thread{
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
class Hello extends Thread{
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
public class Threadclass
{
	public static void main(String[] args) {
	   Hii obj1=new Hii();//obj1 is acts as thread now
	   Hello obj2=new Hello();//obj2 is acts as thread now
	   obj2.start();//whenver we call the start() menas we have to override the run() confirmly
	   obj1.start();//start() will call the run() internaly
	   //no priority for the these threads so it will execute randomly
	}
}
