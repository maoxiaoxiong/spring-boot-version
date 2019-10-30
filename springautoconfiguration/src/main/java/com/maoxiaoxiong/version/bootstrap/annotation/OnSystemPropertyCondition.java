package com.maoxiaoxiong.version.bootstrap.annotation;

import com.maoxiaoxiong.version.bootstrap.conditional.ConditionOnSystemProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.version.bootstrap.annotation
 * @date 2019/10/29 10:32 PM
 * @ClassName OnSystemPropertyCondition
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String, Object> attributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionOnSystemProperty.class.getName());
        String name = (String) attributes.get("name");
        String value = (String) attributes.get("value");
        String property = System.getProperty(name);


        return value.equals(property);
    }
}
