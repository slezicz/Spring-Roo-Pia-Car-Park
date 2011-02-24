package org.zcu.fav.kiv.pia.slezacek.model;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity(finders = { "findUsersesByUsername" })
public class Users {

    @NotNull
    @Column(unique = true)
    @Size(min = 3)
    private String username;

    @NotNull
    @Size(min = 4)
    private String password;

    private transient String passwordCheck;

    @NotNull
    @Column(unique = true)
    //@Pattern(regexp = "^[_A-Za-z0-9-]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$")
    @Email
    private String email;

    @Value("true")
    private Boolean enabled;

    private transient String captchaChalenge;

    private transient String captchaCheck;
}
