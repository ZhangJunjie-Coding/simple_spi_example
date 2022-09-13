package cn.memset;

import cn.memset.spi.InternetService;

import java.util.ServiceLoader;

/**
 * @author 俊杰
 * @date 9/13/2022 10:12 AM
 */
public class Application {
    public static void main(String[] args) {
        ServiceLoader<InternetService> loader =
                ServiceLoader.load(InternetService.class);
        for(InternetService provider : loader){
            provider.connectInternet();
        }
    }
}
