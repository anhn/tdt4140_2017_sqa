/**
 * Adapted from The Java Tutorial
 * Second Edition by Campione, M. and
 * Walrath, K.Addison-Wesley 1998
 */

/**
 * Identify the problem in having concurrent threads
 **/
public class Task5 {
  public static void main(String[] args){
    //These are the two resource objects, i.e. printing tasks 
    final Object resource1 = "resource1";
    final Object resource2 = "resource2";
    //Here's the first thread.  
    Thread t1 = new Thread() {
      public void run() {
        //Lock resource 1
        synchronized(resource1){
          System.out.println("Thread 1: Resource 1 in use ...");
          try{ 
            Thread.sleep(50); 
          } catch (InterruptedException e) {}
          synchronized(resource2){
            System.out.println("Thread 1: Resource 2 in use ...");
          }
        }
      }
    };

    //Here's the second thread.  
    Thread t2 = new Thread(){
      public void run(){
        //Lock resource 2
        synchronized(resource2){
          System.out.println("Thread 2: Resource 2 in use ...");
          try{
            Thread.sleep(50); 
          } catch (InterruptedException e){}
          synchronized(resource1){
            System.out.println("Thread 2: locked resource 1");
          }
        }
      }
    };

    //Start the two threads. 
    t1.start(); 
    t2.start();
  }
}