package com.example.demo.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.NONE)
public class Configs {
  public static final Integer DEFAULT_OFFSET = 0;
  public static final Integer DEFAULT_LIMIT = 10;
  public static final String APP_ENV = System.getProperty("APP_ENV", "dev");
  public static final boolean IS_DEV_ENV = APP_ENV.equals("dev") || APP_ENV.equals("qc");
  public static final String FRONT_END_BUILD_PATH = "/WEB-INF/view/react/build/";
}
