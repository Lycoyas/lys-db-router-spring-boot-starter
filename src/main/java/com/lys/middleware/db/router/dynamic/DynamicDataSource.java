package com.lys.middleware.db.router.dynamic;

import com.lys.middleware.db.router.DBContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author Lycoyas
 * @create 2023-04-10 20:33
 * @description 动态数据源获取，每当切换数据源，都要从这个里面进行获取
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return "db"+ DBContextHolder.getDBKey();
    }
}
