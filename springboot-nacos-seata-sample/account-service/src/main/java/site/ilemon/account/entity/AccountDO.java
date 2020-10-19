package site.ilemon.account.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * <p></p>
 *
 * @author Andy.Yan
 */
@Data
public class AccountDO {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 余额
     */
    private BigDecimal money;
}
