package com.tasneem.springsecurityjwt.model;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9191694500041129392L;
	private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
