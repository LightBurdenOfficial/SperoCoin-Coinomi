package com.sperocoin.core.messages;

import com.sperocoin.core.wallet.AbstractTransaction;

import javax.annotation.Nullable;

/**
 * @author John L. Jegutanis
 */
public interface MessageFactory {
    int maxMessageSizeBytes();

    boolean canHandlePublicMessages();

    boolean canHandlePrivateMessages();

    TxMessage createPublicMessage(String message);

    @Nullable
    TxMessage extractPublicMessage(AbstractTransaction transaction);
}
