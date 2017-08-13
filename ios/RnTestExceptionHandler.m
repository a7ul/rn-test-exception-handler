
#import "RnTestExceptionHandler.h"

@implementation RnTestExceptionHandler

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()
RCT_EXPORT_METHOD(raiseTestNativeError) {
    NSLog(@"RAISING A TEST EXCEPTION");
    [NSException raise:@"TEST EXCEPTION" format:@"THIS IS A TEST EXCEPTION"];
}

@end
