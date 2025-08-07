package com.pega.dsm.dnode.impl.dataflow.asyncexecutor.execution.prehandlers;

import com.pega.dsm.dnode.impl.dataflow.asyncexecutor.configuration.QueueProcessorExecutionConfig;
import com.pega.pegarules.pub.clipboard.ClipboardPage;
import com.pega.platform.executor.queueprocessor.QueueProcessorException;
import org.grishin.patch.annotations.Decorate;
import org.grishin.patch.annotations.DecoratedMethod;
import org.grishin.patch.annotations.OriginClass;

import java.util.Objects;

@OriginClass("com.pega.dsm.dnode.impl.dataflow.asyncexecutor.execution.prehandlers.PagesSetUp")
@Decorate
public class PagesSetUpDecorators {

    @DecoratedMethod
    ClipboardPage getPrimaryPage(QueueProcessorExecutionConfig config) throws QueueProcessorException {
        this.__getPrimaryPage(config);
        return config.isSnapShotOfPageEnqueued() && Objects.isNull(config.getMessageContentPage().getString("ABRMessageKey")) ? this.getSnapshotPage(config) : this.getMessageContentFromDB(config);
    }

    ClipboardPage __getPrimaryPage(QueueProcessorExecutionConfig config) throws QueueProcessorException {
        return null;
    }

    private ClipboardPage getSnapshotPage(QueueProcessorExecutionConfig config) {
        return null;
    }

    private ClipboardPage getMessageContentFromDB(QueueProcessorExecutionConfig config) {
        return null;
    }
}
