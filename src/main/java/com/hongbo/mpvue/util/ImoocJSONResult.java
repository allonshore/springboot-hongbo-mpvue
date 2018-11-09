package com.hongbo.mpvue.util;

/*
* 自定义数据结构
*     200表示成功
*     500表示错误，错误信息在msg'字段中
*     501 bean错误，不管多个错误都以map放回
*     502 拦截器拦截到用户token出错
*     55 异常派出信息
* */
public class ImoocJSONResult {
    //响应业务状态
    private Integer status;
    //响应消息
    private String msg;
    //响应中的数据
    private Object data;
}
