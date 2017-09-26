package com.example.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import static com.example.rabbitmq.Constants.MESSAGE_QUEUE;

@Component
public class MqBinder {
    @Bean
    Queue queue() {
        return new Queue(MESSAGE_QUEUE, true);
    }


    @Bean
    DirectExchange exchange() {
        return new DirectExchange("logstash-rabbitmq");
    }

    @Bean
    Binding binding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(MESSAGE_QUEUE);
    }
}
