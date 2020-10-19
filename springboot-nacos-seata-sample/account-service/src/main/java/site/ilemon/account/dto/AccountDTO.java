package site.ilemon.account.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p></p>
 *
 * @author Andy.Yan
 */
@Data
public class AccountDTO implements Serializable {
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
