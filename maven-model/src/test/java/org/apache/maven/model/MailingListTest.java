/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Tests {@code MailingList}.
 *
 * @author Benjamin Bentmann
 */
public class MailingListTest {

    @Test
    public void testHashCodeNullSafe() {
        new MailingList().hashCode();
    }

    @Test
    public void testEqualsNullSafe() {
        assertFalse(new MailingList().equals(null));

        new MailingList().equals(new MailingList());
    }

    @Test
    public void testEqualsIdentity() {
        MailingList thing = new MailingList();
        assertTrue(thing.equals(thing));
    }

    @Test
    public void testToStringNullSafe() {
        assertNotNull(new MailingList().toString());
    }

    public void testToStringNotNonsense() {
        MailingList list = new MailingList();
        list.setName("modello-dev");

        String s = list.toString();

        assertEquals("MailingList {name=modello-dev, archive=null}", s);
    }
}
