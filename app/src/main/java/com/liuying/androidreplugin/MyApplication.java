package com.liuying.androidreplugin;

import com.qihoo360.replugin.RePluginApplication;
import com.qihoo360.replugin.RePluginConfig;

/**
 * MyApplication
 *
 * Created by liuying on 2018/7/10 16:45.
 * Email: ly1203575492@163.com
 */
public class MyApplication extends RePluginApplication {
  @Override public void onCreate() {
    super.onCreate();
  }

  @Override protected RePluginConfig createConfig() {
    RePluginConfig c = new RePluginConfig();
    c.setVerifySign(!BuildConfig.DEBUG);
    return c;
  }
}
