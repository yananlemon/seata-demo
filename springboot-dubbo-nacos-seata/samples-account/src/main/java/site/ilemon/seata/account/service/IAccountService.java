package site.ilemon.seata.account.service;

import site.ilemon.seata.common.dto.AccountDTO;
import site.ilemon.seata.common.response.ObjectResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * * @author root
 * @since 2019-09-04
 */
public interface IAccountService {

    /**
     * 减少账户余额
     * @param accountDTO 参考{@link AccountDTO}
     * @return 参考 {@link ObjectResponse}
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
