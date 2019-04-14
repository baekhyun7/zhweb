package com.zhweb.util;

import com.zhweb.config.BaiDuApiConfiguration;
import org.springframework.web.multipart.MultipartFile;

import java.net.URLEncoder;

/**
 * 功能描述： 添加类/接口功能描述
 *
 * @ClassName ImageDeFogUtil
 * @Description 图像去雾
 * @Author zh
 * @Data 2019/04/10 13:28
 * @Version 1.0
 */
public class ImageDeFogUtil {
    final static String URL= "https://aip.baidubce.com/rest/2.0/image-classify/v1/dehaze";

    public static void imageDeFog(byte[] imgData){
        try {
            // 本地文件路径
           // String filePath = "[本地文件路径]";
            //byte[] imgData = FileUtil.readFileByBytes(filePath);
            //byte[] imgData = file.getBytes();
            String imgStr = Base64Util.encode(imgData);
            String imgParam = URLEncoder.encode(imgStr, "UTF-8");

            String param = "image=" + imgParam;

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = BaiDuApiConfiguration.getAuth();

            HttpUtil.post(URL, accessToken, param);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
