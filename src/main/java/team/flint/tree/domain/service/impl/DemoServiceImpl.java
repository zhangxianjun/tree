package team.flint.tree.domain.service.impl;

import team.flint.tree.dal.mapper.DemoMapper;
import team.flint.tree.domain.manager.DemoManager;
import team.flint.tree.domain.service.DemoService;
import team.flint.tree.model.vo.DemoVo;

/**
 * 案例
 */
public class DemoServiceImpl implements DemoService {

//    @Resource
    private DemoMapper demoMapper;
    private DemoManager demoManager;

    @Override
    public void buy() {
        // 库存扣减
        demoMapper.subtractInventory();
        // 资金扣减
        DemoVo vo = demoManager.deductPayment();
    }

}
