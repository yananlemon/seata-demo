package site.ilemon.seata.storage.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import site.ilemon.seata.storage.entity.TStorage;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * * @author root
 * @since 2019-09-04
 */
public interface TStorageMapper extends BaseMapper<TStorage> {

    /**
     * 扣减商品库存
     * @Param: commodityCode 商品code  count扣减数量
     * @Return:
     */
    int decreaseStorage(@Param("commodityCode") String commodityCode, @Param("count") Integer count);
}
