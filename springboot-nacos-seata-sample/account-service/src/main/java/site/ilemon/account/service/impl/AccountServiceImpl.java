package site.ilemon.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.ilemon.account.dao.IAccountDao;
import site.ilemon.account.dto.AccountDTO;
import site.ilemon.account.entity.AccountDO;
import site.ilemon.account.service.IAccountService;

/**
 * <p></p>
 *
 * @author Andy.Yan
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    /**
     * 更新账户余额
     *
     * @param accountDTO
     * @return
     */
    @Override
    public Integer update(AccountDTO accountDTO) {
        AccountDO accountDO = new AccountDO();
        accountDO.setMoney(accountDTO.getMoney());
        accountDO.setUserId(accountDTO.getUserId());
        return accountDao.update(accountDO);
    }
}
