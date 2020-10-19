package site.ilemon.account.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.ilemon.account.AccountServiceApplication;
import site.ilemon.account.dao.IAccountDao;
import site.ilemon.account.entity.AccountDO;

import java.math.BigDecimal;

/**
 * <p></p>
 *
 * @author Andy.Yan
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AccountServiceApplication.class)
public class AccountDaoTest {
    @Autowired
    private IAccountDao accountDao;

    @Test
    public void testUpdate() {
        AccountDO accountDO = new AccountDO();
        accountDO.setUserId(1);
        accountDO.setMoney(new BigDecimal(10));
        accountDao.update(accountDO);
    }
}
