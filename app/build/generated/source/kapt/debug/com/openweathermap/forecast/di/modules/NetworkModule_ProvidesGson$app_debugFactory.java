// Generated by Dagger (https://dagger.dev).
package com.openweathermap.forecast.di.modules;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesGson$app_debugFactory implements Factory<Gson> {
  private final NetworkModule module;

  public NetworkModule_ProvidesGson$app_debugFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return providesGson$app_debug(module);
  }

  public static NetworkModule_ProvidesGson$app_debugFactory create(NetworkModule module) {
    return new NetworkModule_ProvidesGson$app_debugFactory(module);
  }

  public static Gson providesGson$app_debug(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesGson$app_debug());
  }
}
