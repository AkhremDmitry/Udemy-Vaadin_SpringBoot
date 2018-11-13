package com.felix.mapped;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractPerson {

    protected String drivindLicence;

    public String getDrivindLicence() {
        return drivindLicence;
    }

    public void setDrivindLicence(String drivindLicence) {
        this.drivindLicence = drivindLicence;
    }

    public AbstractPerson() {
    }
}
