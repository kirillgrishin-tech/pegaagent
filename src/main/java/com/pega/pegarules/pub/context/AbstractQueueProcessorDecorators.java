package com.pega.pegarules.pub.context;

import com.pega.pegarules.pub.clipboard.ClipboardPage;
import org.grishin.patch.annotations.Decorate;
import org.grishin.patch.annotations.DecoratedMethod;
import org.grishin.patch.annotations.OriginClass;

@OriginClass("com.pega.platform.executor.queueprocessor.internal.AbstractQueueProcessor")
@Decorate
public class AbstractQueueProcessorDecorators {

    @DecoratedMethod
    private void validateLockConfiguration(
            String queueProcessorName, ClipboardPage aMessagePage, QueueProcessorLockConfiguration aLockConfig, boolean aUseCurrentSnapShotForProcessing
    ){

    }
}
