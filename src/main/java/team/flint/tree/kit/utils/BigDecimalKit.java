package team.flint.tree.kit.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal 常用方法统一工具类
 */
public class BigDecimalKit {

    /**
     * 系统精度
     */
    public static int scaleSystem = 2;
    /**
     * 默认精度
     */
    private static int scaleDefault = 8;
    /**
     * 默认精度 系统超长精度
     */
    private static int scaleDefaultMax = 16;


    /**
     * 截取末尾零
     * @param b1 the v 1
     * @return the big decimal
     */
    public static BigDecimal stripZeros(BigDecimal b1) {
        return b1.stripTrailingZeros();
    }
    
    /**
     * 截取末尾零转为字符串类型
     * @param b1 the v 1
     * @return the big decimal
     */
    public static String stripTrailingZeros(BigDecimal b1) {
        return b1.stripTrailingZeros().toPlainString();
    }

    /**
     * 加
     * Add big decimal.
     *
     * @param v1 the v 1
     * @param v2 the v 2
     * @return the big decimal
     */
    public static BigDecimal add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2);
    }

    public static BigDecimal add(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.add(b2);
    }
    public static BigDecimal add(BigDecimal b1, BigDecimal b2) {
        return b1.add(b2);
    }

    /**
     * 减
     * Sub big decimal.
     *
     * @param v1 the v 1
     * @param v2 the v 2
     * @return the big decimal
     */
    public static BigDecimal sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2);
    }

    public static BigDecimal sub(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.subtract(b2);
    }

    /**
     * 减
     * Sub big decimal.
     *
     * @param v1 the v 1
     * @param v2 the v 2
     * @return the big decimal
     */
    public static BigDecimal sub(BigDecimal v1, BigDecimal v2) {
        return v1.subtract(v2);
    }


    /**
     * 乘
     * Mul big decimal.
     *
     * @param v1 the v 1
     * @param v2 the v 2
     * @return the big decimal
     */
    public static BigDecimal mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2);
    }

    public static BigDecimal mul(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.multiply(b2);
    }

    /**
     * 乘
     * Mul big decimal.
     *
     * @param v1 the v 1
     * @param v2 the v 2
     * @return the big decimal
     */
    public static BigDecimal mul(BigDecimal v1, BigDecimal v2) {
        return v1.multiply(v2);
    }

    /**
     * 除
     * Div big decimal.
     *
     * @param v1 the v 1
     * @param v2 the v 2
     * @return the big decimal
     */
    public static BigDecimal div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, RoundingMode.HALF_UP);
    }

    public static BigDecimal div(String v1, String v2) {
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.divide(b2);
    }

    /**
     * 除
     * Div big decimal.
     *
     * @param v1 the v 1
     * @param v2 the v 2
     * @return the big decimal
     */
    public static BigDecimal div(double v1, double v2) {
        return div(v1, v2, scaleDefault);
    }

    /**
     * 除
     * Div big decimal.
     *
     * @param v1 the v 1
     * @param v2 the v 2
     * @return the big decimal
     */
    public static BigDecimal div(BigDecimal v1, BigDecimal v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        return v1.divide(v2, scale, RoundingMode.HALF_UP);
    }

    /**
     * 除
     * Div big decimal.
     *
     * @param v1 the v 1
     * @param v2 the v 2
     * @return the big decimal
     */
    public static BigDecimal divScale(BigDecimal v1, BigDecimal v2) {
        return div(v1, v2, scaleSystem);
    }

    /**
     * 除
     * Div big decimal.
     *
     * @param v1 the v 1
     * @param v2 the v 2
     * @return the big decimal
     */
    public static BigDecimal div(BigDecimal v1, BigDecimal v2) {
        return div(v1, v2, scaleDefault);
    }

    /**
     * 提供精确的小数位四舍五入处理。
     * Div big decimal.
     *
     * @param v1 the v 1
     * @return the big decimal
     */
    public static BigDecimal round(double v1, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal("1");
        return b1.divide(b2, scale, RoundingMode.HALF_UP);
    }

    public static BigDecimal round(double v1) {
        return round(v1, scaleDefault);
    }

    public static BigDecimal roundScale(double v1) {
        return round(v1, scaleSystem);
    }

    /**
     * 提供精确的小数位四舍五入处理。
     * Div big decimal.
     *
     * @param v1 the v 1
     * @return the big decimal
     */
    public static BigDecimal round(BigDecimal v1, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b2 = new BigDecimal("1");
        return v1.divide(b2, scale, RoundingMode.HALF_UP);
    }

    /**
     * 提供精确的小数位四舍五入处理。
     * Div big decimal.
     *
     * @param v1 the v 1
     * @return the big decimal
     */
    public static BigDecimal round(BigDecimal v1) {
        return round(v1, scaleDefault);
    }

    /**
     * 提供精确的小数位四舍五入处理。
     * Div big decimal.
     *
     * @param v1 the v 1
     * @return the big decimal
     */
    public static BigDecimal roundScale(BigDecimal v1) {
        return round(v1, scaleSystem);
    }

    /**
     * 判断不为空，并且大于0
     *
     * @param a
     * @return
     */
    public static boolean isNotNullAndGreaterThan0(BigDecimal a) {
        if (a == null) {
            return false;
        }
        return a.compareTo(BigDecimal.ZERO) > 0;
    }

    /**
     * 判断不为空
     *
     * @param a
     * @return
     */
    public static boolean isNotNull(BigDecimal a) {
        if (a == null) {
            return false;
        }
        return true;
    }

    /**
     * 创建， 但是 值可以为 Null
     *
     * @param str
     * @return
     */
    public static BigDecimal createBigDecimal(String str) {
        return NumberUtils.createBigDecimal(str);
    }

    /**
     * 赋值，自动判断 null，如果为null 时，自动返回 value值
     *
     * @param str
     * @param value 默认值
     * @return
     */
    public static BigDecimal toBigDecimal(BigDecimal str, BigDecimal value) {
        if (!isNotNull(str)) {
            return value;
        }
        return str;
    }

    /**
     * 比较大小
     * 返回  -1  小 ， 0 相等  ，1 大
     *
     * @param b1
     * @param b2
     * @return
     */
    public static int compare(BigDecimal b1, BigDecimal b2) {
        return b1.compareTo(b2);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数
     *
     * @param str
     * @param scale
     * @return
     */
    public static BigDecimal toBigDecimal(String str, int scale) {
        return NumberUtils.toScaledBigDecimal(str, scale, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(String str) {
        return NumberUtils.toScaledBigDecimal(str, scaleDefault, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalDefault(String str) {
        return NumberUtils.toScaledBigDecimal(str, scaleDefaultMax, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 指定 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalScale(String str) {
        return NumberUtils.toScaledBigDecimal(str, scaleSystem, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal2(String str) {
        return NumberUtils.toScaledBigDecimal(str, 2, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 4 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal4(String str) {
        return NumberUtils.toScaledBigDecimal(str, 4, RoundingMode.HALF_UP);
    }

    /**
     * BigDecimal 转换 为 BigDecimal ，保留小数位数
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(BigDecimal str, int scale) {
        return NumberUtils.toScaledBigDecimal(str, scale, RoundingMode.HALF_UP);
    }

    /**
     * BigDecimal 转换 为 BigDecimal ，保留小数位数  2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(BigDecimal str) {
        return NumberUtils.toScaledBigDecimal(str, scaleDefault, RoundingMode.HALF_UP);
    }

    /**
     * BigDecimal 转换 为 BigDecimal ，保留小数位数  2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalDefault(BigDecimal str) {
        return NumberUtils.toScaledBigDecimal(str, scaleDefaultMax, RoundingMode.HALF_UP);
    }

    /**
     * BigDecimal 转换 为 BigDecimal ，保留小数位数  指定 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalScale(BigDecimal str) {
        return NumberUtils.toScaledBigDecimal(str, scaleSystem, RoundingMode.HALF_UP);
    }

    /**
     * BigDecimal 转换 为 BigDecimal ，保留小数位数  2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal2(BigDecimal str) {
        return NumberUtils.toScaledBigDecimal(str, 2, RoundingMode.HALF_UP);
    }

    /**
     * BigDecimal 转换 为 BigDecimal ，保留小数位数  2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal4(BigDecimal str) {
        return NumberUtils.toScaledBigDecimal(str, 4, RoundingMode.HALF_UP);
    }

    /**
     * Double 转换 为 BigDecimal ，保留小数位数  2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal2(Double str) {
        return NumberUtils.toScaledBigDecimal(str, 2, RoundingMode.HALF_UP);
    }

    /**
     * Double 转换 为 BigDecimal ，保留小数位数  2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(Double str) {
        return NumberUtils.toScaledBigDecimal(str, scaleDefault, RoundingMode.HALF_UP);
    }

    /**
     * Double 转换 为 BigDecimal ，保留小数位数  2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalDefault(Double str) {
        return NumberUtils.toScaledBigDecimal(str, scaleDefaultMax, RoundingMode.HALF_UP);
    }

    /**
     * Double 转换 为 BigDecimal ，保留小数位数  指定 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalScale(Double str) {
        return NumberUtils.toScaledBigDecimal(str, scaleSystem, RoundingMode.HALF_UP);
    }

    /**
     * Double 转换 为 BigDecimal ，保留小数位数  4 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal4(Double str) {
        return NumberUtils.toScaledBigDecimal(str, 4, RoundingMode.HALF_UP);
    }

    /**
     * Double 转换 为 BigDecimal ，保留小数位数
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(Double str, int scale) {
        return NumberUtils.toScaledBigDecimal(str, scale, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(Float str) {
        return NumberUtils.toScaledBigDecimal(str, scaleDefault, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalDefault(Float str) {
        return NumberUtils.toScaledBigDecimal(str, scaleDefaultMax, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal2(Float str) {
        return NumberUtils.toScaledBigDecimal(str, 2, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 4 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal4(Float str) {
        return NumberUtils.toScaledBigDecimal(str, 4, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 指定 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(Float str, int scale) {
        return NumberUtils.toScaledBigDecimal(str, scale, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 指定 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalScale(Float str) {
        return NumberUtils.toScaledBigDecimal(str, scaleSystem, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(int str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleDefault, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalDefault(int str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleDefaultMax, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal2(int str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), 2, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 4 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal4(int str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), 4, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 n 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(int str, int scale) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scale, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 指定 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalScale(int str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleSystem, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(long str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleDefault, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalDefault(long str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleDefaultMax, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal2(long str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), 2, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 4 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal4(long str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), 4, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 n 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(long str, int scale) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scale, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 n 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalScale(long str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleSystem, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(float str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleDefault, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalDefault(float str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleDefaultMax, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal2(float str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), 2, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 4 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal4(float str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), 4, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 n 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(float str, int scale) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scale, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 n 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalScale(float str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleSystem, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(double str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleDefault, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalDefault(double str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleDefaultMax, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 2 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal2(double str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), 2, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 4 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal4(double str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), 4, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 4 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimal(double str, int scale) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scale, RoundingMode.HALF_UP);
    }

    /**
     * 字符串转换 为 BigDecimal ，保留小数位数 4 位
     *
     * @param str
     * @return
     */
    public static BigDecimal toBigDecimalScale(double str) {
        return NumberUtils.toScaledBigDecimal(String.valueOf(str), scaleSystem, RoundingMode.HALF_UP);
    }
}
