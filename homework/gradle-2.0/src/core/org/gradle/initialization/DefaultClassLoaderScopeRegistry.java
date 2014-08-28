/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.initialization;

import com.google.common.cache.CacheBuilder;
import org.gradle.api.internal.initialization.ClassLoaderCache;
import org.gradle.api.internal.initialization.ClassLoaderScope;
import org.gradle.api.internal.initialization.DefaultClassLoaderCache;
import org.gradle.api.internal.initialization.RootClassLoaderScope;

public class DefaultClassLoaderScopeRegistry implements ClassLoaderScopeRegistry {

    private final ClassLoaderScope coreAndPluginsScope;
    private final ClassLoaderScope coreScope;

    public DefaultClassLoaderScopeRegistry(ClassLoaderRegistry loaderRegistry) {
        ClassLoaderCache cache = new DefaultClassLoaderCache(CacheBuilder.newBuilder().<DefaultClassLoaderCache.Key, ClassLoader>build());
        this.coreScope = new RootClassLoaderScope(loaderRegistry.getGradleCoreApiClassLoader(), cache);
        this.coreAndPluginsScope = new RootClassLoaderScope(loaderRegistry.getGradleApiClassLoader(), cache);
    }

    public ClassLoaderScope getCoreAndPluginsScope() {
        return coreAndPluginsScope;
    }

    public ClassLoaderScope getCoreScope() {
        return coreScope;
    }
}
