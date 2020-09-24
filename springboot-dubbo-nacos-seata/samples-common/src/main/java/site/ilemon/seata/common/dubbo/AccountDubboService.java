package site.ilemon.seata.common.dubbo;

import site.ilemon.seata.common.dto.AccountDTO;
import site.ilemon.seata.common.response.ObjectResponse;

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
