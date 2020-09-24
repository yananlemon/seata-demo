package site.ilemon.seata.account.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * * @author root
 * @since 2019-09-04
 */
@Data
public class TAccount extends Model<TAccount> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String userId;
    private Double amount;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TAccount{" +
        ", id=" + id +
        ", userId=" + userId +
        ", amount=" + amount +
        "}";
    }
}
