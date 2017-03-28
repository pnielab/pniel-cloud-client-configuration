package server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import server.dtos.AccountDTO;
import server.dtos.AccountToAccountDtoConverter;
import server.model.Account;
import server.service.MessageService;

/**
 * Created by Pniel Abramovich
 */
@RefreshScope
@RestController
public class AccountController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private AccountToAccountDtoConverter converter;


    @RequestMapping(value = "/accounts/{id}", method = RequestMethod.GET)
    public AccountDTO getAccountById(@PathVariable(value = "id") String id) {
        Account account = new Account();
        account.setName("pniel");
        account.setAge(37);
        account.setDescription("fine looking male");
        AccountDTO accountDTO = converter.convert(account);
        accountDTO.setServerMessage(messageService.getMessage());
        return accountDTO;
    }


}
