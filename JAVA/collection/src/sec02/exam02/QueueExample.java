package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "임꺽정"));
        messageQueue.offer(new Message("sendKakaotalk", "이몽룡"));


        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님께 메일을 보냈습니다");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님께 SMS를 보냈습니다.");
                case "sendKakatalk":
                    System.out.println(message.to + "님께 카카오를 보냈습니다.");
            }
        }
        }
    }



