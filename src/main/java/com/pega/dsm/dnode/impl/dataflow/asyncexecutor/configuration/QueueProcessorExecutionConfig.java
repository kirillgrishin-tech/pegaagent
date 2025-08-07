package com.pega.dsm.dnode.impl.dataflow.asyncexecutor.configuration;

import com.pega.pegarules.pub.clipboard.ClipboardPage;

public interface QueueProcessorExecutionConfig {
    boolean isSnapShotOfPageEnqueued();

    ClipboardPage getMessageContentPage();
}
