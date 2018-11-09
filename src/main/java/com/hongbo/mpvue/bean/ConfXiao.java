package com.hongbo.mpvue.bean;

import java.security.PrivateKey;

public class ConfXiao {
    private String serverHost;
    private String tunneServerUrl;
    private String tunnelSignatureKey;
    // 腾讯云相关配置可以查看云 API 秘钥控制台：https://console.cloud.tencent.com/capi
    private String qcloudAppId;       //您的腾讯云 AppID
    private String qcloudSecretId;    //您的腾讯云 SecretId
    private String wxMessageToken;    //您的腾讯云 SecretKey
    private String networkTimeout;
}
