package team.flint.tree.model.enums;

/**
 * 枚举
 */
public enum FlowTypeEnum {
    TRANSFER_IN(257, "划入"),
    TRANSFER_OUT(258, "划出"),
    OFFER(259, "报价"),
    CANCEL_OFFER(260, "报价取消/过期"),
    SALE(261, "卖出"),
    BUYING(262, "买入"),
    FREEZE(513, "报价冻结"),
    // 用户购买支出：报价，一口价，竞拍
    BUY_FEE(514, "报价成交"),
    QUOTATION_EXPIRED(515, "报价过期退回"),
    // 竞价失败
    BID_FAILED(516, "交易失败退回"),
    // 用户卖出收入
    SELL_FEE(517, "卖出收入"),
    QUOTATION_CANCEL(518, "报价取消退回"),
    BOX_FREEZE(519, "盲盒购买冻结"),
    BOX_DEAL(520, "盲盒购买成交"),

    COPYRIGHT_FEE(769, "版权费收入"),
    PLATFORM(1025, "平台手续费收入"),
    GAS_PLATFORM_IN(1026, "平台Gas费收入"),
    GAS_FREEZE(1027, "发行Gas冻结"),
    GAS_UNFREEZE(1028, "发行Gas解冻"),
    GAS_OUT(1028, "发行Gas支出"),
    DIVIDENDS_IN(1281, "分红收入"),
    DIVIDENDS_OUT(1282, "分红支出"),
    SALE_PROCEEDS(1030, "发售收入");



    private final int key;

    private final String value;

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    FlowTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public static FlowTypeEnum getType(int key) {
        for (FlowTypeEnum item : FlowTypeEnum.values()) {
            if (item.getKey() == key) {
                return item;
            }
        }
        throw new IllegalArgumentException();
    }
}