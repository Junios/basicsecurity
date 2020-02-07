package io.security.demo;

import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.Authentication;

import java.util.Collection;

public class AbstainVoter implements AccessDecisionVoter<Object> {
    @Override
    public boolean supports(ConfigAttribute attribute) {
        return true;
    }

    @Override
    public int vote(Authentication authentication, Object object, Collection collection) {
        return ACCESS_ABSTAIN;
    }

    @Override
    public boolean supports(Class clazz) {
        return true;
    }
}
