package team.flint.tree.kit;

import lombok.NonNull;

/**
 * 对中间件进行封装
 */

public class MqKit {


    /**
     * 延时消息
     * @param topic
     * @param key
     * @param content
     * @return
     */
    public static boolean sendDelayMessage(@NonNull String topic, @NonNull String key, String content) {

        return true;
    }


    /**
     * 同步消息
     * @param topic
     * @param key
     * @param content
     * @return
     */
    public static String sendSynchronizeMessage(String topic, String key, String content) {
        return "";
    }
}
