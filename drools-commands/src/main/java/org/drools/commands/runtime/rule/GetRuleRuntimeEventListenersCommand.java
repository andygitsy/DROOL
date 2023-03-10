/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.drools.commands.runtime.rule;

import java.util.Collection;

import org.kie.api.command.ExecutableCommand;
import org.kie.api.event.rule.RuleRuntimeEventListener;
import org.kie.api.runtime.Context;
import org.kie.api.runtime.KieSession;
import org.kie.internal.command.RegistryContext;

public class GetRuleRuntimeEventListenersCommand
    implements
    ExecutableCommand<Collection<RuleRuntimeEventListener>> {

    public Collection<RuleRuntimeEventListener> execute(Context context) {
        KieSession ksession = ((RegistryContext) context).lookup( KieSession.class );
        return ksession.getRuleRuntimeEventListeners();
    }

    public String toString() {
        return "session.getRuleRuntimeEventListeners();";
    }
}
