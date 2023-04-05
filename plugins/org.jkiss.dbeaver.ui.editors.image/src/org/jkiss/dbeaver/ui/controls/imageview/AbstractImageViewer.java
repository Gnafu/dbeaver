/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2023 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ui.controls.imageview;

import org.eclipse.jface.action.IContributionManager;
import org.eclipse.swt.widgets.Composite;

import java.nio.file.Path;

public abstract class AbstractImageViewer extends Composite implements ImageViewer {

    public AbstractImageViewer(Composite parent, int style) {
        super(parent, style);
    }

    /**
     * Fills provided toolbar with actions
     *
     * @param toolBar toolbar to fill
     */
    public void fillToolBar(IContributionManager toolBar) {

    }

    public Path getExternalFilePath() {
        return null;
    }
}
