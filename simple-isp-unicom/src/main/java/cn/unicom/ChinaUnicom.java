package cn.unicom;

import cn.memset.spi.InternetService;

/**
 * @author 俊杰
 * @date 9/13/2022 10:04 AM
 */
public class ChinaUnicom implements InternetService {

    @Override
    public void connectInternet() {
        System.out.println("connect internet by [China Unicom]");
    }
}
