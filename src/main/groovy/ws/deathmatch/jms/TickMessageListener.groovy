package ws.deathmatch.jms

import ws.deathmatch.service.DeathmatchService

interface TickMessageListenerIface {

    void onMessage(String message)

}

class TickMessageListener implements TickMessageListenerIface {

    DeathmatchService service
    TickMessagePublisher publisher

    void onMessage( String message ){
        service.tick()
        sleep( 1000 ) //Wait 1 second
        println message
        publisher.sendMessage(message)
    }

}
