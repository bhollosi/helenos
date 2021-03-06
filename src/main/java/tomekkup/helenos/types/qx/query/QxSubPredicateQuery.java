package tomekkup.helenos.types.qx.query;

import tomekkup.helenos.Converter;

/**
 * ********************************************************
 * Copyright: 2012 Tomek Kuprowski
 *
 * License: GPLv2: http://www.gnu.org/licences/gpl.html
 *
 * @author Tomek Kuprowski (tomekkuprowski at gmail dot com)
 * *******************************************************
 */
public class QxSubPredicateQuery<K, SN, N, V> extends QxPredicateQuery<K, N, V> implements SubQuery<SN> {

    private Class<SN> sNameClass;
    private String sName;

    public QxSubPredicateQuery() {
        super();
    }

    @Override
    public Class<SN> getsNameClass() {
        return sNameClass;
    }

    @Override
    public void setsNameClass(Class<SN> sNameClass) {
        this.sNameClass = sNameClass;
    }

    @Override
    public SN getsName() {
        return Converter.toValue(sName, sNameClass);
    }

    @Override
    public void setsName(String sName) {
        this.sName = sName;
    }
}
