package web.css.wind.common;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
@RabbitListener(queues = "hello")
public class OneToOneReceiver {

    @RabbitHandler
    public void process(String text, Channel channel,@Headers Map<String, Object> headers) {
        Long deli = (Long) headers.get(AmqpHeaders.DELIVERY_TAG);
        try {
            channel.basicAck(deli,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("receiver: " + text);
    }

}
