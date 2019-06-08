package com.andy.java;

/**
 * Created by Administrator on 2019-05-19.
 */

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");

        //单目运算符 ++,--
        int iCnt = 10,  iSum = 20, iTemp = iSum ;
        System.out.println("Inital value  iCnt = "+iCnt +"  iSum = "+ iSum + "  iTemp = " + iTemp );

        iCnt = --iCnt;
        System.out.println("0.iCnt = "+iCnt);

        iCnt = ++iCnt;
        System.out.println("1.iCnt = "+iCnt);


        iTemp = iCnt+30 ;
        System.out.println("iTemp = "+ iTemp);


        iSum = ++iSum + iCnt;
        System.out.println("iSum = "+iSum);

        // 定义包，全部小写 mypackage
        // 定义类名和接口，第一个字母大写后面都小写，如：MyAnimalClass， TheGetInfoInterface
        //定义常亮，全部大写，而且单词用“_”连接，如：I_HOTEL_COUNT, C_HOTEL_NAME
        //定义变量名&方法名，第一个字母小写，后面第一个大写然后小写，如:charCoustemarName,intPersonCnt;
        //尽量使用有意义的单词拼接，如:userName,passWord;

    }


}

class MyOhterClass {

}