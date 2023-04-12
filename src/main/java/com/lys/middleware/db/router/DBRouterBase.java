package com.lys.middleware.db.router;

/**
 * @author Lycoyas
 * @create 2023-04-10 20:34
 * @description 数据源基础配置
 */
public class DBRouterBase {
    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }
}
