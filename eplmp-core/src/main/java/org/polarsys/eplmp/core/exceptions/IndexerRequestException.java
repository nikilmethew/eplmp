/*******************************************************************************
 * Copyright (c) 2017 DocDoku.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    DocDoku - initial API and implementation
 *******************************************************************************/


package org.polarsys.eplmp.core.exceptions;

import java.text.MessageFormat;

/**
 * @author Morgan Guimard
 */
public class IndexerRequestException extends ApplicationException {

    private String error;

    public IndexerRequestException(String error) {
        super();
        this.error = error;
    }

    public IndexerRequestException(String error, Throwable cause) {
        super(cause);
        this.error = error;
    }

    @Override
    public String getLocalizedMessage() {
        String message = getBundleDefaultMessage();
        return MessageFormat.format(message, error);
    }
}
