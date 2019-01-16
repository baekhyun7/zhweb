package com.common.constants;


/**
 * 功能描述：公共常量类
 *
 * @author 王赢方
 * @version 1.0
 * @date 2018-07-31 10:05:21
 */
public class CommonConstants {

    /**
     * 负荷小数位数（精度）
     */
    public static final Integer LOAD_SCALE =4;
    /**
     * 成功的响应码
     */
    public static final String SUCCESS_RESPONSE_CODE = "200";

    /**
     * 失败的响应码
     */
    public static final String FAIL_RESPONSE_CODE = "304";

    /**
     * 错误的响应码
     */
    public static final String ERROR_RESPONSE_CODE = "500";

    /**
     * 工厂码
     */
    public static final Integer BUILDING_TYPE = 9;

    /**
     * 冷水机组码
     */
    public static final Integer EQUIPMENT_CHILLER_CODE = 4121;

    /**
     * 循环管道码
     */
    public static final Integer EQUIPMENT_PIPE_CODE = 4111;

    /**
     * 循环水泵码
     */
    public static final Integer EQUIPMENT_WATERPUMP_CODE = 4119;

    /**
     * 传感器码
     */
    public static final Integer EQUIPMENT_SENSORS_CODE = 5200;

    /**
     * VRV机组码
     */
    public static final Integer EQUIPMENT_VRV_CODE = 4123;

    /**
     * 分集水器码
     */
    public static final Integer EQUIPMENT_CONNECTION_CODE = 4110;

    /**
     * 冷却塔码
     */
    public static final Integer EQUIPMENT_COOLINGTOWER_CODE = 4131;

    /**
     * 空调箱码
     */
    public static final Integer EQUIPMENT_COOLINGCOIL_CODE = 4132;

    /**
     * 锅炉码
     */
    public static final Integer EQUIPMENT_BOILER_CODE = 4122;

    /**
     * 冷冻泵
     */
    public static final Integer CATALOG_FROZEN_PUMP_CODE = 12110;

    /**
     * 冷却泵
     */
    public static final Integer CATALOG_COOLING_PUMP_CODE = 12120;
    /**
     * 冷机
     */
    public static final Integer CATALOG_REFRIGERATOR_CODE = 12130;
    /**
     * 电
     */
    public static final Integer CATALOG_ELECTRIC_CODE = 10000;
    /**
     * 空调目录
     */
    public static final Integer CATALOG_AIR_CODE = 12000;

    /**
     * 江苏省ID
     */
    public static final String JIANGSU_PRIVENCE_CODE = "10320000";

    /**
     * 智能电表码
     */
    public static final Integer EQUIPMENT_SMARTMETER_CODE = 5119;
    //事件状态1 事件待分解
    public static final int EVENT_STATE_ONE = 1;
    //事件状态2 终端待分配
    public static final int EVENT_STATE_TWO = 2;
    //事件状态3 通知待下发
    public static final int EVENT_STATE_THREE = 3;
    //事件状态4 指令待下达
    public static final int EVENT_STATE_FOUR = 4;
    //事件状态5 事件待执行
    public static final int EVENT_STATE_FIVE = 5;
    //事件状态6 事件执行中
    public static final int EVENT_STATE_SIX = 6;
    //事件状态7 事件完成
    public static final int EVENT_STATE_FINISH = 7;
    //气象因子默认值
    public static final Float DEFAULT_FACTOR = 1.05f;

    /**
     * 是否存在
     */
    public static final String IS_EXIST = "-1";

    /**
     * 是否参与调控
     */
    public static final String IS_REGULATION = "1";

    /**
     * 是否离线
     */
    public static final String IS_OFFLINE = "0";

    /**
     * 是否在线
     */
    public static final String IS_ONLINE = "2";

    public static final Float FLOAT_ZERO = 0f;
    public static final Float FLOAT_ONE = 1f;
    //计算事件实际开始及结束的比例值
    public static final Float SCALE = 0.8f;

    public static final String ONLINE = "在线";
    public static final String OFFLINE = "离线";
    public static final String  STIMULATE = "激励型";
    public static final String PRICE = "价格型";
    //常量    1   0
    public static final int ONE = 1;
    public static final int ZERO = 0;
    /**
     * 空调总数measure
     */
    public static final int VRV_AIRTOTAL_MEASURE = 2128;

    /**
     * 开机空调总数measure
     */
    public static final int VRV_AIRTOTAL_ACTION_MEASURE = 2129;


}

