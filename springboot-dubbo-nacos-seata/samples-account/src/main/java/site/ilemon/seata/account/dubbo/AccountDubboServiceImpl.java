package site.ilemon.seata.account.dubbo;

import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import site.ilemon.seata.account.service.IAccountService;
import site.ilemon.seata.common.dto.AccountDTO;
import site.ilemon.seata.common.dubbo.AccountDubboService;
import site.ilemon.seata.common.response.ObjectResponse;

/**
 * <p>Account Dubbo服务</p>
 * @author ilemon
 */
@Service(version = "1.0.0",protocol = "${dubbo.protocol.id}",
         application = "${dubbo.application.id}",registry = "${dubbo.registry.id}",
         timeout = 3000)
@Slf4j
public class AccountDubboServiceImpl implements AccountDubboService {

    private static final String INFO_PREFIX = "[AccountDubboServiceImpl]";

    @Autowired
    private IAccountService accountService;

    @Override
    public ObjectResponse decreaseAccount(AccountDTO accountDTO) {
        log.info(INFO_PREFIX + "全局事务id ：" + RootContext.getXID());
        return accountService.decreaseAccount(accountDTO);
    }
}
