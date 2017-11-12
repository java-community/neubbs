package org.neusoft.neubbs.constant.api;

/**
 * 设置信息
 *
 * @author Suvan
 */
public final class SetConst {

    private SetConst() { }

    /**
     * 图片验证码（储存在 Session）
     */
    public static final String SESSION_CAPTCHA = "captcha";

    /**
     * token 验证（权限）
     */
    public static final String RANK_ADMIN = "admin";


    /**
     * 过期时间（时间戳，ms）
     *      - 1天
     */
    public static final long EXPIRE_TIME_MS_ONE_DAY = 86400000L;
    public static final long EXPIRE_TIME_MS_SIXTY_SECOND = 60000L;
    public static final int EXPIRETIME_S_ZERO  = 0;
    public static final long REDIS_EXPIRED = -2L;

    /**
     * 天
     */
    public static final long ONE_DAY_MS = 86400000L;
    public static final String TODAY = "今天";
    public static final String DAY_AGE = " 天前";

    /**
     * 临时密码长度
     */
    public static final int FORGET_PASSWORD_RANDOM_LENGTH = 6;

    /**
     * 数字
     */
    public static final int THOUSAND = 1000;
    public static final int TWENTY_FOUR = 24;
    public static final int SIXTY = 60;

    /**
     * 长度
     */
    public static final int LENGTH_TWO = 2;

    /**
     * 面积
     */
    public static final int SIZE_TWO = 2;
    public static final int SIZE_THREE = 3;
    public static final int SIZE_FOUR = 4;

    /**
     * 用户头像
     */
    public static final long SIZE_ONE_MB = 1048576;

    /**
     * 账户激活状态
     */
    public static final int ACCOUNT_STATE_TRUE = 1;
    public static final int ACCOUNT_STATE_FALSE = 0;

    /**
     * Response 响应信息格式
     */
    public static final String CHARACTER_ENCODING = "utf-8";
    public static final String CONTENT_TYPE = "application/json;charset=UTF-8";

}