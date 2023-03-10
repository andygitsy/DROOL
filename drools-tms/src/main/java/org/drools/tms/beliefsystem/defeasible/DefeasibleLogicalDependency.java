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

package org.drools.tms.beliefsystem.defeasible;

import org.drools.tms.agenda.TruthMaintenanceSystemActivation;
import org.drools.tms.beliefsystem.simple.SimpleLogicalDependency;

public class DefeasibleLogicalDependency<M extends DefeasibleMode<M>> extends SimpleLogicalDependency<M> {

    public DefeasibleLogicalDependency(TruthMaintenanceSystemActivation<M> justifier, Object justified, Object object, M mode) {
        super(justifier, justified, object, mode);
    }

}
