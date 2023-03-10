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

package org.drools.compiler.compiler;

import org.kie.api.definition.process.Process;
import org.kie.api.io.Resource;
import org.kie.internal.builder.KnowledgeBuilderResult;

import java.io.IOException;
import java.util.List;

public interface ProcessBuilder {

    List<Process> addProcessFromXml(Resource resource) throws IOException;

    List<KnowledgeBuilderResult> getErrors();
}
