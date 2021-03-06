package com.example.mybatis.entity.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 学生的实体类  与班级是多对一，老师是多对多。
 */
@Data
public class Student implements Serializable {

    private String stuId;//学号
    private String stuName;//姓名
    private Integer age;//年龄
    private String sex;//性别
    private String telphone;//联系方式
    private String headPhoto;//头像
    private String personPhoto;//个人生活照
    private String hobby;//爱好
    private String email;//邮箱
    private String descs;//个人简介
    private Grade grade;//班级


}
