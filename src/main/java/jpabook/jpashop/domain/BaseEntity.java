package jpabook.jpashop.domain;

import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import java.time.LocalDateTime;


@MappedSuperclass
public abstract class BaseEntity {
    private String creteBy;
    private LocalDateTime createdDate;
    private String lastModifiedBy;
    private LocalDateTime lasModifiedDate;

    public String getCreteBy() {
        return creteBy;
    }

    public void setCreteBy(String creteBy) {
        this.creteBy = creteBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public LocalDateTime getLasModifiedDate() {
        return lasModifiedDate;
    }

    public void setLasModifiedDate(LocalDateTime lasModifiedDate) {
        this.lasModifiedDate = lasModifiedDate;
    }
}
