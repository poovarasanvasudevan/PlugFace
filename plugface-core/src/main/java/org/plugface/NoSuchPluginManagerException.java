package org.plugface;

/*-
 * #%L
 * plugface-core
 * %%
 * Copyright (C) 2017 Matteo Joliveau
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * #L%
 */

/**
 * An exception thrown when trying to lookup for a non existent {@link PluginManager}.
 * Should be thrown when a {@link PluginManager} is being retrieved from a
 * {@link PlugfaceContext} but is not present in the registry.
 */
public class NoSuchPluginManagerException extends RuntimeException {

    public NoSuchPluginManagerException(String managerName) {
        super("No plugin manager found for: " + managerName);
    }

    public NoSuchPluginManagerException(String managerName, Throwable cause) {
        super("No plugin manager found for: " + managerName, cause);
    }

    public NoSuchPluginManagerException(String managerName, String message, Throwable cause) {
        super(message, cause);
    }
}
