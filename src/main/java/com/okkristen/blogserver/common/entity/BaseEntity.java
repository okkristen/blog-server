package com.okkristen.blogserver.common.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 7988377299341530426L;

    @Id
    @GenericGenerator(name="uuid", strategy="uuid")
    @GeneratedValue(generator="uuid")
    @Column(name="id")
    protected String id;

    @Column(name = "creationtime")
    protected Date creationTimestamp = new Timestamp(System.currentTimeMillis());
    @Column(name = "lastmodifiedtime")
    protected Date modificationTimestamp = new Timestamp(System.currentTimeMillis());

    @Column(name = "dr")
    protected Integer dr;// 是否删除。0:未删除;1:已删除

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Date getModificationTimestamp() {
        return modificationTimestamp;
    }

    public void setModificationTimestamp(Date modificationTimestamp) {
        this.modificationTimestamp = modificationTimestamp;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }
}
