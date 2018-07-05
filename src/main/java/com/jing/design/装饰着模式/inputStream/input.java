package com.jing.design.装饰着模式.inputStream;

import javax.crypto.CipherInputStream;
import javax.swing.*;
import java.io.*;
import java.security.DigestInputStream;
import java.util.zip.CheckedInputStream;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

public class input {


    //装饰类
   // FilterInputStream
    //装饰者
   // BufferedInputStream, CheckedInputStream, CipherInputStream,
    // DataInputStream, DeflaterInputStream, DigestInputStream,
    // InflaterInputStream, LineNumberInputStream, ProgressMonitorInputStream,
    // PushbackInputStream


    //被装饰
    //AudioInputStream, ByteArrayInputStream, FileInputStream,
    // FilterInputStream, InputStream,
    // ObjectInputStream, PipedInputStream, SequenceInputStream,
    // StringBufferInputStream

        public static void main(String[] args){
            try {
                FileInputStream fis=new FileInputStream("BISDemo.txt");
                BufferedInputStream bis=new BufferedInputStream(fis);
                String content=null;
                //自己定义一个缓冲区
                byte[] buffer=new byte[10240];
                int flag=0;
                while((flag=bis.read(buffer))!=-1){
                    content+=new String(buffer, 0, flag);
                }
                System.out.println(content);
                //关闭的时候只需要关闭最外层的流就行了
                bis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
