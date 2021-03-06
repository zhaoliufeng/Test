package com.we_smart.test;

import com.we_smart.sqldao.BaseDAO;
import com.we_smart.test.model.SqlTestBean;

import java.util.List;

/**
 * Created by zhaol on 2018/4/20.
 */

public class BeanDAO extends BaseDAO<SqlTestBean> {

    public BeanDAO() {
        super(SqlTestBean.class);
    }

    public List<SqlTestBean> getListById(int id, int groupId){
        return query(new String[]{"id", "groupId"}, new String[]{String.valueOf(id), String.valueOf(groupId)});
    }
}
