package site.ilemon.seata.common.dubbo;

import site.ilemon.seata.common.dto.OrderDTO;
import site.ilemon.seata.common.response.ObjectResponse;

/**
 * @Author: root
 * @Description  订单服务接口
 * @Date Created in 2019/9/5 16:28
 */
public interface OrderDubboService {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
