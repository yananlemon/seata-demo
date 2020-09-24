package site.ilemon.order.service;

import com.baomidou.mybatisplus.service.IService;
import site.ilemon.order.entity.TOrder;
import site.ilemon.seata.common.dto.OrderDTO;
import site.ilemon.seata.common.response.ObjectResponse;

/**
 * <p>
 *  创建订单
 * </p>
 *
 * * @author root
 * @since 2019-09-04
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
