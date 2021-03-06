/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2015 the original author or authors.
 */
package org.assertj.core.api;

import static org.assertj.core.error.OptionalShouldBeEmpty.shouldBeEmpty;
import static org.assertj.core.error.OptionalShouldBePresent.shouldBePresent;
import static org.assertj.core.error.OptionalShouldContain.shouldContain;

import java.util.OptionalLong;

/**
 * Assertions for {@link java.util.OptionalLong}.
 *
 * @author Jean-Christophe Gay
 * @author Alexander Bischof
 */
public abstract class AbstractOptionalLongAssert<S extends AbstractOptionalLongAssert<S>> extends
    AbstractAssert<S, OptionalLong> {

  protected AbstractOptionalLongAssert(OptionalLong actual, Class<?> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that there is a value present in the actual {@link java.util.OptionalLong}.
   * </p>
   * Assertion will pass :
   * <p>
   * 
   * <pre><code class='java'> assertThat(OptionalLong.of(10)).isPresent();</code></pre>
   * <p>
   * Assertion will fail :
   * <p>
   * 
   * <pre><code class='java'> assertThat(OptionalLong.empty()).isPresent();</code></pre>
   *
   * @return this assertion object.
   * @throws AssertionError if actual value is empty.
   * @throws AssertionError if actual is null.
   */
  public S isPresent() {
    isNotNull();
    if (!actual.isPresent()) throwAssertionError(shouldBePresent(actual));
    return myself;
  }

  /**
   * Verifies that the actual {@link java.util.OptionalLong} is empty.
   * </p>
   * Assertion will pass :
   * <p>
   * 
   * <pre><code class='java'> assertThat(OptionalLong.empty()).isEmpty();</code></pre>
   * <p>
   * Assertion will fail :
   * <p>
   * 
   * <pre><code class='java'> assertThat(OptionalLong.of(10)).isEmpty();</code></pre>
   *
   * @return this assertion object.
   * @throws AssertionError if actual value is present.
   * @throws AssertionError if actual is null.
   */
  public S isEmpty() {
    isNotNull();
    if (actual.isPresent()) throwAssertionError(shouldBeEmpty(actual));
    return myself;
  }

  /**
   * Verifies that the actual {@link java.util.OptionalLong} has the value in argument.
   * </p>
   * Assertion will pass :
   * <p>
   * 
   * <pre><code class='java'> assertThat(OptionalLong.of(8)).hasValue(8);
   * assertThat(OptionalLong.of(8)).hasValue(Integer.valueOf(8));</code></pre>
   * <p>
   * Assertion will fail :
   * <p>
   * 
   * <pre><code class='java'> assertThat(OptionalLong.empty()).hasValue(8);
   * assertThat(OptionalLong.of(7)).hasValue(8);</code></pre>
   *
   * @param expectedValue the expected value inside the {@link java.util.OptionalLong}.
   * @return this assertion object.
   * @throws AssertionError if actual value is empty.
   * @throws AssertionError if actual is null.
   * @throws AssertionError if actual has not the value as expected.
   */
  public S hasValue(long expectedValue) {
    isNotNull();
    if (!actual.isPresent()) throwAssertionError(shouldContain(expectedValue));
    if (expectedValue != actual.getAsLong()) throwAssertionError(shouldContain(actual, expectedValue));
    return myself;
  }
}
