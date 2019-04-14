package com.zhweb;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.io.File;

import static org.opencv.imgproc.Imgproc.*;

/**
 * 功能描述： 添加类/接口功能描述
 *
 * @ClassName TestOpencv
 * @Description TODO
 * @Author zh
 * @Data 2019/04/09 22:33
 * @Version 1.0
 */
public class TestOpencv {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        //注意程序运行的时候需要在VM option添加该行 指明opencv的dll文件所在路径
        //-Djava.library.path=$PROJECT_DIR$\opencv\x64
    }
    public static void main(String[] args) {

        File imgFile = new File("F:/图片/白菜.jpg");

        String dest = "F:/图片";


        //方式二
        Mat src = Imgcodecs.imread(imgFile.toString());
        System.out.println(src);
        Mat gray = new Mat();
//        cvtColor(src,gray,0);
//        Mat src1 = gray;
        boolean imwrite = Imgcodecs.imwrite("F:/图片/白菜22.jpg", src);
        System.out.println(imwrite);
    }
}
