package com.maoxiaoxiong.version.bootstrap.annotation;

import com.maoxiaoxiong.version.bootstrap.configuration.HelloWordConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by IntelliJ IDEA.
 *
 * @author wangzhixiong
 * @description
 * @projectName spring-boot-version
 * @pakageName com.maoxiaoxiong.version.bootstrap.annotation
 * @date 2019/10/29 8:33 PM
 * @ClassName HelloImportSelecor
 */
public class HelloImportSelecor implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        String name = HelloWordConfiguration.class.getName();

        return new String[]{name};
    }
}
