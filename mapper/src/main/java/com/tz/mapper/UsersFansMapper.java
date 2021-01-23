package com.tz.mapper;

import com.tz.pojo.UsersFans;
import com.tz.pojo.UsersFansExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersFansMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sun Dec 06 14:06:29 CST 2020
     */
    long countByExample(UsersFansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sun Dec 06 14:06:29 CST 2020
     */
    int deleteByExample(UsersFansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sun Dec 06 14:06:29 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sun Dec 06 14:06:29 CST 2020
     */
    int insert(UsersFans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sun Dec 06 14:06:29 CST 2020
     */
    int insertSelective(UsersFans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sun Dec 06 14:06:29 CST 2020
     */
    List<UsersFans> selectByExample(UsersFansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sun Dec 06 14:06:29 CST 2020
     */
    UsersFans selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sun Dec 06 14:06:29 CST 2020
     */
    int updateByExampleSelective(@Param("record") UsersFans record, @Param("example") UsersFansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sun Dec 06 14:06:29 CST 2020
     */
    int updateByExample(@Param("record") UsersFans record, @Param("example") UsersFansExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sun Dec 06 14:06:29 CST 2020
     */
    int updateByPrimaryKeySelective(UsersFans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users_fans
     *
     * @mbg.generated Sun Dec 06 14:06:29 CST 2020
     */
    int updateByPrimaryKey(UsersFans record);
}