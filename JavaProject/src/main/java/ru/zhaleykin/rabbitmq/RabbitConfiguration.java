package ru.zhaleykin.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;

public class RabbitConfiguration {
    Logger logger = LoggerFactory.getLogger(RabbitConfiguration.class);

    //настраиваем соединение с RabbitMQ
    @Bean
    public ConnectionFactory connectionFactory() {
        return new CachingConnectionFactory("localhost");
    }

    @Bean
    public AmqpAdmin amqpAdmin(ConnectionFactory connectionFactory) {
        return new RabbitAdmin(connectionFactory);
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        return new RabbitTemplate(connectionFactory);
    }

    //объявляем очередь с именем queue1
    @Bean
    public Queue myQueue() {
        return new Queue("meQueue");
    }

    //объявляем контейнер, который будет содержать листенер для сообщений
//    @Bean
//    public SimpleMessageListenerContainer messageListenerContainer1(ConnectionFactory connectionFactory) {
//        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
//        container.setConnectionFactory(connectionFactory);
//        container.setQueueNames("queue1");
//        //тут ловим сообщения из queue1
//        container.setMessageListener((MessageListener) message -> logger.info("received from queue1 : " + new String(message.getBody())));
//        return container;
//    }
}
