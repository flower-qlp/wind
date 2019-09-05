package web.css.wind.common;

import com.alibaba.fastjson.JSON;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Delivery;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
public class TopicReceiver1 {

    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = "user-topic1", durable = "true"),
            exchange = @Exchange(value = "topic-exchange", durable = "true", type = "topic"),
            key = "topic.receiver"))
    @RabbitHandler
    public void topicProcess(@Payload Object object,
                             @Headers Map<String, Object> headers,
                             Channel channel) {
        Delivery customer= JSON.parseObject(JSON.toJSONString(object), Delivery.class);
        System.out.println("消息被消费1:"+ new String(customer.getBody()));
    }
}
