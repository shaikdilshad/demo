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
    int count;
    public void increment(){ //it means only on thread can execute this method at a tym so if t1 is executing t2 wont intefere viceversa
       synchronized(this)
       {
            System.out.println("Count"+ (++count));
       }
    }
}
 class Ex extends Thread{
    Counter c;
    Ex(Counter c){
        this.c=c;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"is running");
        for(int i=0;i<5;i++){
           c.increment(); 
        }
    }
}
public class  Syncblock
{
	public static void main(String[] args)throws Exception {
	    Counter c=new Counter();
	    Ex t1 =new Ex(c);
	    Ex t2=new Ex(c);
	   t1.start();
	   t2.start();
	}
}

