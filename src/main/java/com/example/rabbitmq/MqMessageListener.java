package com.example.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.example.rabbitmq.Constants.MESSAGE_QUEUE;

@Slf4j
@Component
//@EnableRabbit
public class MqMessageListener /*implements RabbitListenerConfigurer*/ {

    @RabbitListener(queues = {MESSAGE_QUEUE})
    public void receiveMessage(Message message) {
        log.info("message : {}", new String(message.getBody()));
    }

//    RabbitMQ 에서 전달받을 때 Message 대신 바로 지정해 놓은 객체 타입으로 받고자할 떄 설정

//    @Bean
//    public MappingJackson2MessageConverter jsonMessageConverter() {
//        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
//        return converter;
//    }
//
//    @Bean
//    public DefaultMessageHandlerMethodFactory myHandlerMethodFactory() {
//        DefaultMessageHandlerMethodFactory factory = new DefaultMessageHandlerMethodFactory();
//        factory.setMessageConverter(jsonMessageConverter());
//        return factory;
//    }


//    @Override
//    public void configureRabbitListeners(RabbitListenerEndpointRegistrar registrar) {
//        registrar.setMessageHandlerMethodFactory(myHandlerMethodFactory());
//    }

}
