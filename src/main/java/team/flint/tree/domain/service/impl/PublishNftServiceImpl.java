package team.flint.tree.domain.service.impl;


import team.flint.example.domain.manager.BalanceManager;
import team.flint.example.domain.service.PublishNftService;

public class PublishNftServiceImpl implements PublishNftService {

    private BalanceManager balanceManager;

    @Override
    public void publishNft() {
        // 修改发布状态

        // 扣减发布费用
        balanceManager.saveBalance();
    }
}
