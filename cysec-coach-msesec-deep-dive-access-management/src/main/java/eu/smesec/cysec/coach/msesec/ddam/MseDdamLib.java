/*
 * Copyright (C) 2021 - 2022 FHNW (University of Applied Sciences and Arts Northwestern Switzerland)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.smesec.cysec.coach.msesec.ddam;

import eu.smesec.cysec.platform.bridge.ILibCal;
import eu.smesec.cysec.platform.bridge.generated.Answer;
import eu.smesec.cysec.platform.bridge.generated.Question;
import eu.smesec.cysec.platform.bridge.generated.Questionnaire;
import eu.smesec.cysec.csl.AbstractLib;

public class MseDdamLib extends AbstractLib {

    @Override
    protected void initHook(final String id, final Questionnaire questionnaire, final ILibCal libCal) {
        // nothing to do
    }

    @Override
    protected void onBeginHook() {
        // nothing to do
    }

    @Override
    protected void onResumeHook(final String qId) {
        // nothing to do
    }

    @Override
    protected void onResponseChangeHook(final Question question, final Answer answer) {
        // nothing to do
    }

}
