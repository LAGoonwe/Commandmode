package com.lagoon.Dir;

/**
 * 该问题描述的是请求者请求在硬盘上建立目录，还可以撤销请求，这就要求接收者不仅可以在硬盘上建立目录，也可以删除上一次请求所建立的目录
 * 该类扮演的是接收者角色，即既可以新增目录，也可以删除目录
 */
import java.io.*;
public class MakeDir {
    public void createDir(String name){
        File dir=new File(name);
        dir.mkdir();
    }

    public void deleteDir(String name){
        File dir=new File(name);
        dir.delete();
    }
}
