
# rn-test-exception-handler

A react native module to purposefully raise a Native Exception to try and crash the app.

This was basically created by me to test my other library:
[https://github.com/master-atul/react-native-exception-handler](https://github.com/master-atul/react-native-exception-handler)

DO NOT USE IN PRODUCTION - I mean why will you use it production ? 😂

## Getting started

`$ npm install rn-test-exception-handler --save`

### Mostly automatic installation

`$ react-native link rn-test-exception-handler`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `rn-test-exception-handler` and add `RnTestExceptionHandler.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRnTestExceptionHandler.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.masteratul.rn.testexception.RnTestExceptionHandlerPackage;` to the imports at the top of the file
  - Add `new RnTestExceptionHandlerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':rn-test-exception-handler'
  	project(':rn-test-exception-handler').projectDir = new File(rootProject.projectDir, 	'../node_modules/rn-test-exception-handler/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':rn-test-exception-handler')
  	```


## Usage
```javascript
import RnTestExceptionHandler from 'rn-test-exception-handler';


RnTestExceptionHandler.raiseTestNativeError();
```

When you call `RnTestExceptionHandler.raiseTestNativeError();`

The module basically raises a native exception in both iOS and Android.


## How it does it?

`RnTestExceptionHandler.raiseTestNativeError();` causes:

In Android
```java
@ReactMethod
public void raiseTestNativeError() throws Exception {
  throw new Exception("TEST EXCEPTION ON ANDROID");
}
```

In iOS
```c
RCT_EXPORT_METHOD(raiseTestNativeError) {
    NSLog(@"RAISING A TEST EXCEPTION");
    [NSException raise:@"TEST EXCEPTION" format:@"THIS IS A TEST EXCEPTION"];
}
```


Peace ! ✌🏻🍻
