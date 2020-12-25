package com.pzyruo.util;

import java.util.UUID;

/**
 * @ClassName FileUtil
 * @Description 获取文件的真实名称并进行转换
 * @Author 我的电脑
 * @Date 2020/12/17 9:26
 * @Version 1.0
 **/
public class FileUtil {



    /*
            * @Description: TODO
            * @Param:  无
            * @Return: 重命名的文件
            * @Throws
            **/

    public static String ReFileName(){
        return UUID.randomUUID().toString().replace("-","");

    }


    /*
            * @Description: 获取文件格式
            * @Param:  	文件名字
            * @Return:  文件格式
            * @Throws
            **/

    public static String RealFileName(String realName){

        return realName.substring(realName.lastIndexOf("."));
    }
}