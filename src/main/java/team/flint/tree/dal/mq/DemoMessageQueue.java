//package team.flint.tree.dal.mq;
//
//import org.springframework.stereotype.Service;
//import team.flint.tree.Config;
//import team.flint.tree.kit.MessageQueueKit;
//
//import javax.annotation.Resource;
//
///**
// * 案例
// */
//
//@Service
//public class DemoMessageQueue {
//
//    @Resource
//    private MessageQueueKit messageQueueKit;
//
//    /**
//     * 给注册用户发送积分
//     */
//    public boolean sendIntegrationToRegister(Long userId) {
//        String json = "{\"userId\": 10000}";
//        messageQueueKit.sendMessage(Config.topicAddIntegrationToRegister,
//                Config.topicAddIntegrationToRegister+userId, json);
//        return true;
//    }
//}
