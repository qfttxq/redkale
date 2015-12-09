/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redkale.convert.ext;

import org.redkale.convert.Reader;
import org.redkale.convert.SimpledCoder;
import org.redkale.convert.Writer;

/**
 *
 * @author zhangjx
 * @param <R>
 * @param <W>
 */
public final class LongSimpledCoder<R extends Reader, W extends Writer> extends SimpledCoder<R, W, Long> {

    public static final LongSimpledCoder instance = new LongSimpledCoder();

    @Override
    public void convertTo(W out, Long value) {
        out.writeLong(value);
    }

    @Override
    public Long convertFrom(R in) {
        return in.readLong();
    }

}