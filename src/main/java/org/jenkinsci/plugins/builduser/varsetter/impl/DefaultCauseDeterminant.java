package org.jenkinsci.plugins.builduser.varsetter.impl;

import org.jenkinsci.plugins.builduser.utils.UsernameUtils;
import org.jenkinsci.plugins.builduser.varsetter.IUsernameSettable;

import java.util.Map;

import hudson.model.Cause;

public class DefaultCauseDeterminant implements IUsernameSettable<Cause> {
    @Override
    public boolean setJenkinsUserBuildVars(Cause cause, Map<String, String> variables) {
        if (cause != null) {
            String name = "";
            name = cause.getClass().getSimpleName();
            name = name.replace("Cause", "");
            UsernameUtils.setUsernameVars(name, variables);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Class<Cause> getUsedCauseClass() {
        return Cause.class;
    }
}
