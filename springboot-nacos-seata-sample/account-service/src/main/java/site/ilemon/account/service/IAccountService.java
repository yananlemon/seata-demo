package site.ilemon.account.service;

import site.ilemon.account.dto.AccountDTO;

/**
 * <p></p>
 *
 * @author Andy.Yan
 */
public interface IAccountService {

    /**
     * 更新账户余额
     * @param accountDTO
     * @return
     */
    Integer update(AccountDTO accountDTO);
}
