package site.ilemon.seata.account.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import site.ilemon.seata.account.entity.TAccount;
import site.ilemon.seata.account.mapper.TAccountMapper;
import site.ilemon.seata.common.dto.AccountDTO;
import site.ilemon.seata.common.enums.RspStatusEnum;
import site.ilemon.seata.common.response.ObjectResponse;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * * @author root
 * @since 2019-09-04
 */
@Service
public class TAccountServiceImpl extends ServiceImpl<TAccountMapper, TAccount> implements ITAccountService {

    @Override
    public ObjectResponse decreaseAccount(AccountDTO accountDTO) {
        int account = baseMapper.decreaseAccount(accountDTO.getUserId(), accountDTO.getAmount().doubleValue());
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
