package site.ilemon.seata.account.service;

import com.baomidou.mybatisplus.service.IService;
import site.ilemon.seata.account.entity.TAccount;
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
public interface ITAccountService extends IService<TAccount> {

    /**
     * 扣用户钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
