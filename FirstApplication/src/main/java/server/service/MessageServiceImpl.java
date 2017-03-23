package server.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * Created by Pniel Abramovich
 */
@RefreshScope
@Service
public class MessageServiceImpl implements MessageService {

    @Value("${messageService.message}")
    private String message;

    @Override
    public String getMessage() {
        return message;
    }
}
