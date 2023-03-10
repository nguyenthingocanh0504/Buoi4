package Day2.QueueExample;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //Gia su co 10 tin nhan cung gui vao he thong
        //he thong chi co the xu ly 3s/1 tin
        //de luu tru duoc cac tin nhan tren -> dua vao hang doi

        Queue<Message> queue=new PriorityQueue<>();
        queue.add(new Message(1,"mgs 1"));
        queue.add(new Message(2,"mgs 1"));
        queue.add(new Message(3,"mgs 1"));
        queue.add(new Message(4,"mgs 1"));
        queue.add(new Message(5,"mgs 1"));
        queue.add(new Message(6,"mgs 1"));

        while (!queue.isEmpty()){
            Message msg=queue.poll();
            System.out.println(msg);
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                throw new RuntimeException("error");
            }
        }
    }
}
