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
public class TopicReceiver {

    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = "user-topics", durable = "true"),
            exchange = @Exchange(value = "topic-exchange", durable = "true", type = "topic"),
            key = "topic.receivers"
    ))
    @RabbitHandler
    public void topicProcess(@Payload Object object,
                             @Headers Map<String, Object> headers,
                             Channel channel) {
        try {
            Delivery customer = JSON.parseObject(JSON.toJSONString(object), Delivery.class);

            //出现错误
            if (headers.get("error") != null) {
                channel.basicReject((Long) headers.get(AmqpHeaders.DELIVERY_TAG), false);
                return;
            }

            Long deli = (Long) headers.get(AmqpHeaders.DELIVERY_TAG);
            channel.basicAck(deli, false);
            System.out.println("消息被消费2:" + new String(customer.getBody()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
