package com.goku.coreui.sys.mapper;

import com.goku.coreui.sys.model.SysUserInfo;

public interface SysUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_info
     *
     * @mbg.generated
     */
    int insert(SysUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_info
     *
     * @mbg.generated
     */
    int insertSelective(SysUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_info
     *
     * @mbg.generated
     */
    SysUserInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysUserInfo record);
}