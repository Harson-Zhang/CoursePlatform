package cn.young.manager.mapper;

import cn.young.manager.pojo.Admin;

public interface AdminMapper {
    Admin adminLogin(String aname,String password);
}
