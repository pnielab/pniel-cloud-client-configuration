package server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.service.MessageService;

/**
 * Created by Zeev Ben Sender on 3/19/2017.
 */
@RestController
public class UnRefreshableMessageController {


    @Autowired
    private MessageService service;

    @RequestMapping("/unRefreshableMessageController/client/message")
    String getMessage() {
        return service.getMessage();
    }


}
