/*
 * �� �� ��:  RestResult.java
 * ��    ��:  RestResult.java
 * ʱ    ��:  2013-6-6
 */
package com.quandi.bgs.util;

/**
 * rest������
 * 
 * @author ztc
 * @version [BABYSHOW V1R1C1, 2013-6-6]
 */
public class RestResult
{
    /**
     * ������
     */
    private String resultCode;
    
    /**
     * ������Ϣ
     */
    private String resultMsg;
    
    /**
     * ��ȡ resultCode
     * 
     * @return ���� resultCode
     */
    public String getResultCode()
    {
        return resultCode;
    }
    
    /**
     * ���� resultCode
     * 
     * @param ��resultCode���и�ֵ
     */
    public void setResultCode(String resultCode)
    {
        this.resultCode = resultCode;
    }
    
    /**
     * ��ȡ resultMsg
     * 
     * @return ���� resultMsg
     */
    public String getResultMsg()
    {
        return resultMsg;
    }
    
    /**
     * ���� resultMsg
     * 
     * @param ��resultMsg���и�ֵ
     */
    public void setResultMsg(String resultMsg)
    {
        this.resultMsg = resultMsg;
    }
    
}
