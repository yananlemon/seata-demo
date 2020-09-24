package site.ilemon.seata.storage.service;

import com.baomidou.mybatisplus.service.IService;
import site.ilemon.seata.common.dto.CommodityDTO;
import site.ilemon.seata.common.response.ObjectResponse;
import site.ilemon.seata.storage.entity.TStorage;

/**
 * 仓库服务
 *
 * * @author root
 * @since 2019-09-04
 */
public interface ITStorageService extends IService<TStorage> {

    /**
     * 扣减库存
     */
    ObjectResponse decreaseStorage(CommodityDTO commodityDTO);
}
