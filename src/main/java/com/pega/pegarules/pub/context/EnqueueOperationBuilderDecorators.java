package com.pega.pegarules.pub.context;

import org.grishin.patch.annotations.Decorate;
import org.grishin.patch.annotations.DecoratedMethod;
import org.grishin.patch.annotations.OriginClass;

@OriginClass("com.pega.pegarules.pub.context.EnqueueOperationBuilder")
@Decorate
public class EnqueueOperationBuilderDecorators {

    @DecoratedMethod
    public EnqueueOperationConfig build() {
        return new EnqueueOperationConfig(this);
    }
}
