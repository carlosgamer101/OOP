

class MultiThread extends Thread{
    private int threadNumber;
    public MultiThread(int threadNumber){
        this.threadNumber = threadNumber;
    }
 @Override
    public void run(){
       //thread code
       for (int i = 1; i<=1; i++) {
           System.out.println(i +"from " +threadNumber);

        //    if(threadNumber ==3){
        //     throw new RuntimeException();
        //    }
           try {
               Thread.sleep(1000);
           } 
           catch (InterruptedException e) {
           }
       }
    }  
}