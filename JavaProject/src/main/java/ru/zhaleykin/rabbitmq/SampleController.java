package ru.zhaleykin.rabbitmq;

//import org.apache.log4j.Logger;
//import org.springframework.amqp.core.AmqpTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    Logger logger = LoggerFactory.getLogger(SampleController.class);

//    @Autowired
//    AmqpTemplate template;

//    @RequestMapping("/emit")
//    @ResponseBody
    @GetMapping("/emit")
    String queue1() {
        logger.info("Emit to queue1");
//        template.convertAndSend("queue1","Message to queue");
        return "Emit to queue";
    }
}