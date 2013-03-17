/*
 * Created on Oct 24, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.assertj.core.error;

import static junit.framework.Assert.assertEquals;

import static org.assertj.core.data.Offset.offset;
import static org.assertj.core.error.ShouldBeEqualWithinOffset.shouldBeEqual;

import org.assertj.core.description.Description;
import org.assertj.core.error.ErrorMessageFactory;
import org.assertj.core.error.ShouldBeEqualWithinOffset;
import org.assertj.core.internal.TestDescription;
import org.junit.Before;
import org.junit.Test;


/**
 * Tests for <code>{@link ShouldBeEqualWithinOffset#create(Description)}</code>.
 * 
 * @author Alex Ruiz
 */
public class ShouldBeEqualWithinOffset_create_Test {

  private ErrorMessageFactory factory;

  @Before
  public void setUp() {
    factory = shouldBeEqual(8f, 6f, offset(1f), 2f);
  }

  @Test
  public void should_create_error_message() {
    String message = factory.create(new TestDescription("Test"));
    assertEquals("[Test] expecting <8.0f> to be close to <6.0f> within offset <1.0f> but offset was <2.0f>", message);
  }
}