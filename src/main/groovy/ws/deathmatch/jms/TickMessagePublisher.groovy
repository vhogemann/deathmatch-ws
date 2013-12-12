package ws.deathmatch.jms

import org.springframework.jms.core.JmsTemplate

class TickMessagePublisher {

    JmsTemplate jmsTemplate

    void sendMessage(){
        jmsTemplate.convertAndSend( "tick" );
    }
}
