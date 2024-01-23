package org.example.lury.generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName book
 */
@TableName(value ="book")
@Data
public class Book implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 书本名称
     */
    private String name;

    /**
     * 中文描述
     */
    private String cnDesc;

    /**
     * 英文文描述
     */
    private String enDesc;

    /**
     * 外文标识
     */
    private String fornF;

    /**
     * ISBN代码
     */
    private String isbnCd;

    /**
     * 分类ID
     */
    private Integer ctgrId;

    /**
     * 
     */
    private String crtr;

    /**
     * 
     */
    private Date crtTm;

    /**
     * 
     */
    private String updtr;

    /**
     * 
     */
    private Date updTm;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Book other = (Book) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCnDesc() == null ? other.getCnDesc() == null : this.getCnDesc().equals(other.getCnDesc()))
            && (this.getEnDesc() == null ? other.getEnDesc() == null : this.getEnDesc().equals(other.getEnDesc()))
            && (this.getFornF() == null ? other.getFornF() == null : this.getFornF().equals(other.getFornF()))
            && (this.getIsbnCd() == null ? other.getIsbnCd() == null : this.getIsbnCd().equals(other.getIsbnCd()))
            && (this.getCtgrId() == null ? other.getCtgrId() == null : this.getCtgrId().equals(other.getCtgrId()))
            && (this.getCrtr() == null ? other.getCrtr() == null : this.getCrtr().equals(other.getCrtr()))
            && (this.getCrtTm() == null ? other.getCrtTm() == null : this.getCrtTm().equals(other.getCrtTm()))
            && (this.getUpdtr() == null ? other.getUpdtr() == null : this.getUpdtr().equals(other.getUpdtr()))
            && (this.getUpdTm() == null ? other.getUpdTm() == null : this.getUpdTm().equals(other.getUpdTm()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCnDesc() == null) ? 0 : getCnDesc().hashCode());
        result = prime * result + ((getEnDesc() == null) ? 0 : getEnDesc().hashCode());
        result = prime * result + ((getFornF() == null) ? 0 : getFornF().hashCode());
        result = prime * result + ((getIsbnCd() == null) ? 0 : getIsbnCd().hashCode());
        result = prime * result + ((getCtgrId() == null) ? 0 : getCtgrId().hashCode());
        result = prime * result + ((getCrtr() == null) ? 0 : getCrtr().hashCode());
        result = prime * result + ((getCrtTm() == null) ? 0 : getCrtTm().hashCode());
        result = prime * result + ((getUpdtr() == null) ? 0 : getUpdtr().hashCode());
        result = prime * result + ((getUpdTm() == null) ? 0 : getUpdTm().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", cnDesc=").append(cnDesc);
        sb.append(", enDesc=").append(enDesc);
        sb.append(", fornF=").append(fornF);
        sb.append(", isbnCd=").append(isbnCd);
        sb.append(", ctgrId=").append(ctgrId);
        sb.append(", crtr=").append(crtr);
        sb.append(", crtTm=").append(crtTm);
        sb.append(", updtr=").append(updtr);
        sb.append(", updTm=").append(updTm);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}