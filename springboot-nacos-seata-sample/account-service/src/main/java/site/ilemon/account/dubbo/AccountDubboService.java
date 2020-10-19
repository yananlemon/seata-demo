package site.ilemon.account.dubbo;

import site.ilemon.account.dto.AccountDTO;
import site.ilemon.account.dto.ObjectResponse;

/**
 * <p>Account Dubbo服务</p>
 * @author ilemon
 */
public interface AccountDubboService {

    /**
     * 从账户扣钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
