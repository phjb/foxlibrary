package com.paulobarbosa.foxlibrary.global.entity;

import com.paulobarbosa.foxlibrary.core.util.Constants;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public abstract class Company extends EntityBase {
    @NotEmpty(message = Constants.REQUIRED_FILED)
    @Size(max = 50)
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Size(max = 500)
    @Column(name = "information", length = 500)
    private String information;

    @Size(max = 100)
    @Column(name = "address", length = 100)
    private String address;

    @Size(max = 100)
    @Column(name = "website", length = 100)
    private String website;
}
