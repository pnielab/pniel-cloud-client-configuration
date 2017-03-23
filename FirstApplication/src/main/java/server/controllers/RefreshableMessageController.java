package server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.service.MessageService;

/**
 * Created by Pniel Abramovich
 */
@RefreshScope
@RestController
public class RefreshableMessageController {


    @Autowired
    private MessageService service;

    @RequestMapping("/refreshableMessageController/client/message")
    String getMessage() {
        return service.getMessage();
    }


}
