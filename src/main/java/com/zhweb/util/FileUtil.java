package com.zhweb.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


/**
 * 文件读取工具类
 */
public class FileUtil {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final  String PATH = "D:\\ideaProject\\zhweb\\src\\main\\resources";

    /**
     * 读取文件内容，作为字符串返回
     */
    public static String readFileAsString(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException(filePath);
        } 

        if (file.length() > 1024 * 1024 * 1024) {
            throw new IOException("File is too large");
        } 

        StringBuilder sb = new StringBuilder((int) (file.length()));
        // 创建字节输入流  
        FileInputStream fis = new FileInputStream(filePath);  
        // 创建一个长度为10240的Buffer
        byte[] bbuf = new byte[10240];  
        // 用于保存实际读取的字节数  
        int hasRead = 0;  
        while ( (hasRead = fis.read(bbuf)) > 0 ) {  
            sb.append(new String(bbuf, 0, hasRead));  
        }  
        fis.close();  
        return sb.toString();
    }

    /**
     * 根据文件路径读取byte[] 数组
     */
    public static byte[] readFileByBytes(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException(filePath);
        } else {
            ByteArrayOutputStream bos = new ByteArrayOutputStream((int) file.length());
            BufferedInputStream in = null;

            try {
                in = new BufferedInputStream(new FileInputStream(file));
                short bufSize = 1024;
                byte[] buffer = new byte[bufSize];
                int len1;
                while (-1 != (len1 = in.read(buffer, 0, bufSize))) {
                    bos.write(buffer, 0, len1);
                }

                byte[] var7 = bos.toByteArray();
                return var7;
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                } catch (IOException var14) {
                    var14.printStackTrace();
                }

                bos.close();
            }
        }
    }
    public static String upload(MultipartFile imageFile) {
        if (imageFile.isEmpty()) {
            return null;
        }
        String filename = imageFile.getOriginalFilename();

        String ext= null;
        if(filename.contains(".")){
            ext = filename.substring(filename.lastIndexOf("."));
        }else{
            ext = "";
        }

        String uuid =  UUID.randomUUID().toString().replaceAll("-", "");
        String nfileName = uuid + ext;

        String dirPath = DateFormatUtils.format(new Date(), "yyyyMMdd");

        String filepath = PATH+dirPath;
        File targetFile = new File(filepath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        } else {
            targetFile.delete();
        }
        String fileUrl = filepath+"/"+nfileName;
        try {
            imageFile.transferTo(new File(fileUrl));
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileurl  = "http://localhost:8081/picture/"+dirPath+"/"+nfileName;
        return fileurl;

    }

}
