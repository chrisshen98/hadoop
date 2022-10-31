package org.apache.hadoop.conf;

public class COConfiguration extends Configuration {

  public String getStackTrace() {
    String stackTrace = " ";
    for (StackTraceElement elem: Thread.currentThread().getStackTrace()) {
        stackTrace = stackTrace.concat(elem.getClassName() + "\t");
    }
    return stackTrace;
  }

  @Override
  public String get(String name) {
    LOG.warn("[CTEST][GET-PARAM] " + key + getStackTrace());
    // System.out.println("[CTEST][GET-PARAM] " + key + getStackTrace());
    return super.get(name);
  }

  @Override
  public String getRaw(String name) {
    LOG.warn("[CTEST][GET-PARAM] " + key + getStackTrace());
    // System.out.println("[CTEST][GET-PARAM] " + key + getStackTrace());
    return super.getRaw(name);
  }

  @Override
  public void set(String name, String value, String source) {
    LOG.warn("[CTEST][SET-PARAM] " + key + getStackTrace());
    // System.out.println("[CTEST][SET-PARAM] " + key + getStackTrace());
    super.set(name, value, source);
  }
  
  @Override
  public String get(String name, String defaultValue) {
    LOG.warn("[CTEST][GET-PARAM] " + key + getStackTrace());
    // System.out.println("[CTEST][GET-PARAM] " + key + getStackTrace());
    return super.get(name, defaultValue);
  }
}
