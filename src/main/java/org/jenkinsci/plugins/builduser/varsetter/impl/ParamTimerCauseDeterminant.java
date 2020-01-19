package org.jenkinsci.plugins.builduser.varsetter.impl;

import org.jenkinsci.plugins.builduser.utils.UsernameUtils;
import org.jenkinsci.plugins.builduser.varsetter.IUsernameSettable;
import org.jenkinsci.plugins.parameterizedscheduler.ParameterizedTimerTriggerCause;

import java.util.Map;

public class ParamTimerCauseDeterminant implements IUsernameSettable<ParameterizedTimerTriggerCause> {

    final Class<ParameterizedTimerTriggerCause> causeClass = ParameterizedTimerTriggerCause.class;

    public boolean setJenkinsUserBuildVars(ParameterizedTimerTriggerCause cause, Map<String, String> variables) {
        if (cause != null) {
            UsernameUtils.setUsernameVars("ParameterizedTimerTrigger", variables);
            return true;
        } else {
            return false;
        }
    }

    public Class<ParameterizedTimerTriggerCause> getUsedCauseClass() {
        return causeClass;
    }

}
