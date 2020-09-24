package site.ilemon.seata.storage.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import site.ilemon.seata.common.dto.CommodityDTO;
import site.ilemon.seata.common.enums.RspStatusEnum;
import site.ilemon.seata.common.response.ObjectResponse;
import site.ilemon.seata.storage.entity.TStorage;
import site.ilemon.seata.storage.mapper.TStorageMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  库存服务实现类
 * </p>
 *
 * * @author root
 * @since 2019-09-04
 */
@Service
public class TStorageServiceImpl extends ServiceImpl<TStorageMapper, TStorage> implements ITStorageService {

    @Override
    public ObjectResponse decreaseStorage(CommodityDTO commodityDTO) {
        int storage = baseMapper.decreaseStorage(commodityDTO.getCommodityCode(), commodityDTO.getCount());
        ObjectResponse<Object> response = new ObjectResponse<>();
        if (storage > 0){
            response.setStatus(RspStatusEnum.SUCCESS.getCode());
            response.setMessage(RspStatusEnum.SUCCESS.getMessage());
            return response;
        }

        response.setStatus(RspStatusEnum.FAIL.getCode());
        response.setMessage(RspStatusEnum.FAIL.getMessage());
        return response;
    }
}
