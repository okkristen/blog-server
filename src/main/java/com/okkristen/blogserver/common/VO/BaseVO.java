package com.okkristen.blogserver.common.VO;


import java.io.Serializable;
import java.util.Date;

public class BaseVO implements Serializable {

    private static final long serialVersionUID = 7988377299341530426L;

    protected String id;

    protected Date creationTime;
    protected Date modificationTime;

    protected Integer dr;// 是否删除。0:未删除;1:已删除

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }
}
