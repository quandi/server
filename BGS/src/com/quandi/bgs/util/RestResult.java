/*
 * 文 件 名:  RestResult.java
 * 描    述:  RestResult.java
 * 时    间:  2013-6-6
 */
package com.quandi.bgs.util;

/**
 * rest返回码
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-6]
 */
public class RestResult
{
    /**
     * 返回码
     */
    private String resultCode;
    
    /**
     * 返回信息
     */
    private String resultMsg;
    
    /**
     * 获取 resultCode
     * 
     * @return 返回 resultCode
     */
    public String getResultCode()
    {
        return resultCode;
    }
    
    /**
     * 设置 resultCode
     * 
     * @param 对resultCode进行赋值
     */
    public void setResultCode(String resultCode)
    {
        this.resultCode = resultCode;
    }
    
    /**
     * 获取 resultMsg
     * 
     * @return 返回 resultMsg
     */
    public String getResultMsg()
    {
        return resultMsg;
    }
    
    /**
     * 设置 resultMsg
     * 
     * @param 对resultMsg进行赋值
     */
    public void setResultMsg(String resultMsg)
    {
        this.resultMsg = resultMsg;
    }
    
}
