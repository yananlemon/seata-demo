package site.ilemon.seata.common.dubbo;

import site.ilemon.seata.common.dto.CommodityDTO;
import site.ilemon.seata.common.response.ObjectResponse;

/**
 * @Author: root
 * @Description  库存服务
 * @Date Created in 2019/9/5 16:22
 */
public interface StorageDubboService {

    /**
     * 扣减库存
     */
    ObjectResponse decreaseStorage(CommodityDTO commodityDTO);
}
