/*******************************************************************************
 *     Cloud Foundry 
 *     Copyright (c) [2009-2014] Pivotal Software, Inc. All Rights Reserved.
 *
 *     This product is licensed to you under the Apache License, Version 2.0 (the "License").
 *     You may not use this product except in compliance with the License.
 *
 *     This product includes a number of subcomponents with
 *     separate copyright notices and license terms. Your use of these
 *     subcomponents is subject to the terms and conditions of the
 *     subcomponent's license, as noted in the LICENSE file.
 *******************************************************************************/
package org.cloudfoundry.identity.uaa.login;

import org.springframework.util.StringUtils;

public class PasswordConfirmationValidation {
    private final String password;
    private final String passwordConfirmation;

    public PasswordConfirmationValidation(String password, String passwordConfirmation) {
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
    }

    public boolean valid() {
        return StringUtils.hasText(password) && StringUtils.hasText(passwordConfirmation) && password.equals(passwordConfirmation);
    }

    public String getMessageCode() {
        return "form_error";
    }
}
