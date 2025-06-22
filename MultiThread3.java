public class MultiThread3 extends Thread{
    public void run(){
      for (int i = 0; i < 10; i++) {
          System.out.println("SSS");
      }
      try {
          Thread.sleep(1);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    
}
