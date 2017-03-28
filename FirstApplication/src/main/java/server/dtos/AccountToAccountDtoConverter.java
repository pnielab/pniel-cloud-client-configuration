package server.dtos;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import server.model.Account;

/**
 * Created by Pniel Abramovich
 */
@Service
public class AccountToAccountDtoConverter implements Converter<Account, AccountDTO> {

    @Override
    public AccountDTO convert(Account account) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAge(account.getAge());
        accountDTO.setName(account.getName());
        accountDTO.setDescription(account.getDescription());
        return accountDTO;
    }
}

