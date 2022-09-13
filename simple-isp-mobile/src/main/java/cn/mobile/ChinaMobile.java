package cn.mobile;

import cn.memset.spi.InternetService;

/**
 * @author 俊杰
 * @date 9/13/2022 8:48 AM
 */
public class ChinaMobile implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("connect internet by [China Mobile]");
    }
}
