// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.roo.mulmod.model;

import com.roo.mulmod.model.Attachment;
import com.roo.mulmod.model.User;
import java.util.Objects;

privileged aspect Attachment_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long Attachment.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return Attachment
     */
    public Attachment Attachment.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Integer
     */
    public Integer Attachment.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return Attachment
     */
    public Attachment Attachment.setVersion(Integer version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets fileName value
     * 
     * @return String
     */
    public String Attachment.getFileName() {
        return this.fileName;
    }
    
    /**
     * Sets fileName value
     * 
     * @param fileName
     * @return Attachment
     */
    public Attachment Attachment.setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    
    /**
     * Gets fileContent value
     * 
     * @return Byte
     */
    public byte[] Attachment.getFileContent() {
        return this.fileContent;
    }
    
    /**
     * Sets fileContent value
     * 
     * @param fileContent
     * @return Attachment
     */
    public Attachment Attachment.setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
        return this;
    }
    
    /**
     * Gets uzer value
     * 
     * @return User
     */
    public User Attachment.getUzer() {
        return this.uzer;
    }
    
    /**
     * Sets uzer value
     * 
     * @param uzer
     * @return Attachment
     */
    public Attachment Attachment.setUzer(User uzer) {
        this.uzer = uzer;
        return this;
    }
    
    /**
     * This `equals` implementation is specific for JPA entities and uses 
     * the entity identifier for it, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @param obj
     * @return Boolean
     */
    public boolean Attachment.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof Attachment)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Attachment) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int Attachment.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Attachment.toString() {
        return "Attachment {" + 
                "id='" + id + '\'' + 
                ", version='" + version + '\'' + 
                ", fileName='" + fileName + '\'' + 
                ", fileContent='" + fileContent + '\'' + "}" + super.toString();
    }
    
}
