package niuhaihang.test;

import java.util.Random;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynchronousQueueQuiz1 {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<String> queue=new SynchronousQueue();
        // TODO Auto-generated method stub
        for(int i=0;i<5;i++)
            new Thread(new ThreadProducer(queue)).start();
        for(int i=0;i<5;i++)
            new Thread(new ThreadConsumer(queue)).start();
    }
}
class ThreadProducer implements Runnable {
    ThreadProducer(SynchronousQueue<String> queue)
    {
        this.queue=queue;
    }
    SynchronousQueue<String> queue;
    static int cnt=0;
    public void run()
    {
        String name="";
        int val=0;
        Random random =new Random(System.currentTimeMillis());
        for(int i=0;i<2;i++){

            cnt=(cnt+1)&0xFFFFFFFF;

            try{
                val=random.nextInt()%15;
                if(val<5)
                {
                    name="offer name:"+cnt;
                    queue.offer(name);
                }
                else if(val<10)
                {
                    name="put name:"+cnt;
                    queue.put(name);
                }
                else
                {
                    name="offer wait time and name:"+cnt;
                    queue.offer(name, 1000, TimeUnit.MILLISECONDS);
                }
                Thread.sleep(1);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class ThreadConsumer implements Runnable {
    ThreadConsumer(SynchronousQueue<String> queue) {
        this.queue = queue;
    }
    SynchronousQueue<String> queue;

    public void run() {
        String name;
         for(int i=0;i<2;i++){
            try {
                name = queue.take();
                System.out.println("take " + name);
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}