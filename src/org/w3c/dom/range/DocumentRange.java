/*
 * Copyright (c) 1999 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de
 * Recherche en Informatique et en Automatique, Keio University). All
 * Rights Reserved. This program is distributed under the W3C's Software
 * Intellectual Property License. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See W3C License http://www.w3.org/Consortium/Legal/ for more
 * details.
 */

package org.w3c.dom.range;

/**
 */
public interface DocumentRange {
    /**
     * This interface can be obtained from the object implementing the 
     * <code>Document</code> interface using binding-specific casting methods.
     * @return The initial state of the range returned from this  method is 
     *   such that both of its boundary-points are positioned at the 
     *   beginning  of the corresponding  Document, before any content. The 
     *   range returned can only be used to select content associated with 
     *   this Document, or with DocumentFragments and Attrs for which this 
     *   Document is the <code>ownerDocument</code>.
     */
    public Range        createRange();
}

