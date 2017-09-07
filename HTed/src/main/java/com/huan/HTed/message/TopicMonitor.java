
package com.huan.HTed.message;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface TopicMonitor {
    String[] channel() default {};

    /**
     * default empty,auto detect depends on object type.
     * <p>
     * IQueueMessageListener:onQueueMessage<br>
     * OTHERS:onMessage
     *
     */
    String method() default "";
}