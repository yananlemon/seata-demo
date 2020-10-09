package site.ilemon.seata.account.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import site.ilemon.seata.account.entity.AccountDO;

/**
 * <p>AccountMapper接口</p>
 * @author ilemon
 */
@Repository
public interface AccountMapper extends BaseMapper<AccountDO> {

    /**
     * 减少账户金额
     * @param userId 用户ID
     * @param amount 金额
     * @return {@link Integer}受影响的行数
     */
    int decreaseAccount(@Param("userId") String userId, @Param("amount") Double amount);
}
