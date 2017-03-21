package com.supervision.dal.conf.domain.entity;

/**
 * Created by Zeus Feng on 2017/3/20.
 *
 * @author Zeus Feng
 * @date 2017/03/20
 */
public class ConfDomainDO {
    /**
     * 唯一ID
     */
    Long ID;
    /**
     * URL的名称
     */
    String URL_NAME;
    /**
     * URL的具体名称
     */
    String URL_PREFIX;

    @Override
    public String toString() {
        return "ConfDomainDO{" +
            "ID=" + ID +
            ", URL_NAME='" + URL_NAME + '\'' +
            ", URL_PREFIX='" + URL_PREFIX + '\'' +
            '}';
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getURL_NAME() {
        return URL_NAME;
    }

    public void setURL_NAME(String URL_NAME) {
        this.URL_NAME = URL_NAME;
    }

    public String getURL_PREFIX() {
        return URL_PREFIX;
    }

    public void setURL_PREFIX(String URL_PREFIX) {
        this.URL_PREFIX = URL_PREFIX;
    }
}
