
package com.masteratul.rn.testexception;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RnTestExceptionHandlerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RnTestExceptionHandlerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RnTestExceptionHandler";
  }

  @ReactMethod
  public void raiseTestNativeError() throws Exception {
    throw new Exception("TEST EXCEPTION ON ANDROID");
  }
}
