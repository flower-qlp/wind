package web.css.wind.utils;

//import com.alibaba.fastjson.JSON;
//import com.rabbitmq.client.Channel;
//import com.rabbitmq.client.Connection;
//import com.rabbitmq.client.ConnectionFactory;
//import com.rabbitmq.client.QueueingConsumer;

import java.io.IOException;

public class RabbitReceive {

//    public final String QUEUE_NAME = "advance";
//
//    public void getMessage() {
//        ConnectionFactory factory = new ConnectionFactory();
//        factory.setHost("10.2.26.143");
//        try {
//            Connection connection = factory.newConnection();
//
//            Channel channel = connection.createChannel();
//            //防止接受者先运行 先运行 新建一个队列
//            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
//
//            //创建消费者
//            QueueingConsumer consumer = new QueueingConsumer(channel);
//            channel.basicConsume(QUEUE_NAME, true, consumer);
//
//            while(true){
//                QueueingConsumer.Delivery delivery=consumer.nextDelivery();
//
//                String message=new String(delivery.getBody());
//                System.out.println("Receive:"+message);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        new RabbitReceive().getMessage();
//    }
}
