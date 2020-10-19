package site.ilemon.account.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import site.ilemon.account.entity.AccountDO;

/**
 * <p></p>
 *
 * @author Andy.Yan
 */
@Mapper
public interface IAccountDao {
    Integer update(AccountDO accountDO);
}
