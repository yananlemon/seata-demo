package site.ilemon.seata.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.ilemon.seata.account.mapper.AccountMapper;
import site.ilemon.seata.common.dto.AccountDTO;
import site.ilemon.seata.common.enums.RspStatusEnum;
import site.ilemon.seata.common.response.ObjectResponse;

/**
 * <p>账户Service实现类</p>
 * @author ilemon
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;


    /**
     * 减少账户余额
     * @param accountDTO 参考{@link AccountDTO}
     * @return 参考 {@link ObjectResponse}
     */
    @Override
    public ObjectResponse decreaseAccount(AccountDTO accountDTO) {
        int account = accountMapper.decreaseAccount(accountDTO.getUserId(), accountDTO.getAmount().doubleValue());
        ObjectResponse<Object> response = new ObjectResponse<>();
        if (account > 0){
            response.setStatus(RspStatusEnum.SUCCESS.getCode());
            response.setMessage(RspStatusEnum.SUCCESS.getMessage());
            return response;
        }

        response.setStatus(RspStatusEnum.FAIL.getCode());
        response.setMessage(RspStatusEnum.FAIL.getMessage());
        return response;
    }
}
