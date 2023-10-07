/* Copyright 2023 Better Ltd (www.better.care)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package care.better.pf4j.ksp.processor

import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import org.pf4j.Extension

/**
 * @author Primoz Delopst
 * @since 1.0.0
 *
 * Implementation of [SymbolProcessorProvider] that provides [SymbolProcessor] for [Extension] annotation processing.
 *
 * @constructor Creates a new instance of [ExtensionSymbolProcessor]
 */
class ExtensionSymbolProcessorProvider : SymbolProcessorProvider {
    /**
     * Returns new instance of [ExtensionSymbolProcessor]
     *
     * @param environment [SymbolProcessorEnvironment]
     * @return [ExtensionSymbolProcessor]
     */
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor = ExtensionSymbolProcessor(environment)
}
