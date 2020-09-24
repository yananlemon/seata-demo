package site.ilemon.seata.account.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import site.ilemon.seata.account.entity.TAccount;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * * @author root
 * @since 2019-09-04
 */
public interface TAccountMapper extends BaseMapper<TAccount> {

    int decreaseAccount(@Param("userId") String userId, @Param("amount") Double amount);
}
