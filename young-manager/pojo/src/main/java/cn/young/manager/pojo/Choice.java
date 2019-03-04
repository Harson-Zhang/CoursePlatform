package cn.young.manager.pojo;

import java.io.Serializable;
import java.util.Date;

public class Choice implements Serializable {
    private Long cid;

    private Long uid;

    private String courseCode;

    private Integer mark;

    private Date contentDate;

    private Integer status;

    private Integer stillChoose;

    private String content;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode == null ? null : courseCode.trim();
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Date getContentDate() {
        return contentDate;
    }

    public void setContentDate(Date contentDate) {
        this.contentDate = contentDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStillChoose() {
        return stillChoose;
    }

    public void setStillChoose(Integer stillChoose) {
        this.stillChoose = stillChoose;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}