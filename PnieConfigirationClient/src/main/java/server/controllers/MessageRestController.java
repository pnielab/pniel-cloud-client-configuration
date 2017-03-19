package server.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zeev Ben Sender on 3/19/2017.
 */
@RefreshScope
@RestController
public class MessageRestController {


    @Value("${clientMessage:Hello default}")
    private String clientMessage;

    @RequestMapping("/client/message")
    String getMessage() {
        return this.clientMessage;
    }


}
