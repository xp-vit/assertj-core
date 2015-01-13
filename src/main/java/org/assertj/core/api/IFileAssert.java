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

import java.io.File;
import java.nio.charset.Charset;

/**
 * Created by Alexander Bischof on 16.12.14.
 */
public interface IFileAssert<S extends AbstractFileAssert<S>> extends Assert<S, File> {
  IFileAssert<S> exists();

  IFileAssert<S> doesNotExist();

  IFileAssert<S> isFile();

  IFileAssert<S> isDirectory();

  IFileAssert<S> isAbsolute();

  IFileAssert<S> isRelative();

  IFileAssert<S> hasContentEqualTo(File expected);

  IFileAssert<S> hasBinaryContent(byte[] expected);

  IFileAssert<S> usingCharset(String charsetName);

  IFileAssert<S> usingCharset(Charset charset);

  IFileAssert<S> hasContent(String expected);

  IFileAssert<S> canWrite();

  IFileAssert<S> canRead();

  IFileAssert<S> hasParent(File expected);

  IFileAssert<S> hasParent(String expected);

  IFileAssert<S> hasExtension(String expected);

  IFileAssert<S> hasName(String expected);

  IFileAssert<S> hasNoParent();
}
