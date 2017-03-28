package com.tikal.controller;

import com.tikal.dtos.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Pniel Abramovich
 */
@RestController
public class AccountController {

    @Autowired
    private RestTemplate loadBalancedRestTemplate;

    @RequestMapping(value = "accounts/{id}", method = RequestMethod.GET)
    public AccountDTO getAccountById(@PathVariable(value = "id") String id) {
        String url = String.format("http://%s%s/{id}", AccountEndPoints.ACCOUNT_SERVIDE_ID, AccountEndPoints.ACCOUNTS_ENDPOINT);
        return this.loadBalancedRestTemplate.getForObject(url, AccountDTO.class, id);
    }

}
