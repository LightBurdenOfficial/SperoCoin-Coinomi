package com.sperocoin.core.exceptions;

import com.sperocoin.core.coins.CoinType;

/**
 * @author John L. Jegutanis
 */
public class UnsupportedCoinTypeException extends RuntimeException {
    public UnsupportedCoinTypeException(CoinType type) {
        super("Unsupported coin type: " + type);
    }

    public UnsupportedCoinTypeException(String message) {
        super(message);
    }
}
