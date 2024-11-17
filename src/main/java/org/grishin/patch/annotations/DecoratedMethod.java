package org.grishin.patch.annotations;

import org.grishin.patch.MethodProcesor;

public @interface DecoratedMethod {
    String name() default "";
    String signature() default "";
    Class<? extends MethodProcesor>[] baseMethodProcessors() default {};
}