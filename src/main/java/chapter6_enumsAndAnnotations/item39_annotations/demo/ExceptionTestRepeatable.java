package chapter6_enumsAndAnnotations.item39_annotations.demo;

import java.lang.annotation.*;

// Repeatable annotation type
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ExceptionTestContainer.class)
public @interface ExceptionTestRepeatable {
    Class<? extends Exception> value();
}