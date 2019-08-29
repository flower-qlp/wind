package web.css.wind.common;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
public class TopicReceiver1 {

    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = "user-topics", durable = "true"),
            exchange = @Exchange(value = "topic-exchange", durable = "true", type = "topic"),
            key = "topic.receiver"))
    @RabbitHandler
    public void topicProcess(@Payload Object object,
                             @Headers Map<String, Object> headers,
                             Channel channel) {
        System.out.println("消息被消费");
    }
}
