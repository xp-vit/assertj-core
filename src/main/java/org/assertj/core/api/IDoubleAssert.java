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
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.core.api;

import org.assertj.core.data.Offset;

/**
 * Created by Alexander Bischof on 16.12.14.
 */
public interface IDoubleAssert<S extends AbstractDoubleAssert<S>>
    extends Assert<S, Double>, ComparableAssert<S, Double>, FloatingPointNumberAssert<S, Double> {
  
  // duplicate javadoc of isCloseTo(double other, Offset<Double> offset but can't define it in super class
  IDoubleAssert<S> isCloseTo(double other, Offset<Double> offset);

  IDoubleAssert<S> isEqualTo(double expected);

  IDoubleAssert<S> isEqualTo(double expected, Offset<Double> offset);

  IDoubleAssert<S> isNotEqualTo(double other);

  IDoubleAssert<S> isLessThan(double other);

  IDoubleAssert<S> isLessThanOrEqualTo(double other);

  IDoubleAssert<S> isGreaterThan(double other);

  IDoubleAssert<S> isGreaterThanOrEqualTo(double other);
}
