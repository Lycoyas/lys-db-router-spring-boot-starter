package com.lys.middleware.db.router;

/**
 * @author Lycoyas
 * @create 2023-04-10 20:34
 * @description 数据路由配置
 */
public class DBRouterConfig {
    private int dbCount;  //分库数
    private int tbCount;  //分表数

    public DBRouterConfig() {
    }

    public DBRouterConfig(int dbCount, int tbCount) {
        this.dbCount = dbCount;
        this.tbCount = tbCount;
    }

    public int getDbCount() {
        return dbCount;
    }

    public void setDbCount(int dbCount) {
        this.dbCount = dbCount;
    }

    public int getTbCount() {
        return tbCount;
    }

    public void setTbCount(int tbCount) {
        this.tbCount = tbCount;
    }

}
