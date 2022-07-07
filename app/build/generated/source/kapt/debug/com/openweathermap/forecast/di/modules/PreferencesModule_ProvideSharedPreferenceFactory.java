// Generated by Dagger (https://dagger.dev).
package com.openweathermap.forecast.di.modules;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PreferencesModule_ProvideSharedPreferenceFactory implements Factory<SharedPreferences> {
  private final PreferencesModule module;

  private final Provider<Context> contextProvider;

  public PreferencesModule_ProvideSharedPreferenceFactory(PreferencesModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreference(module, contextProvider.get());
  }

  public static PreferencesModule_ProvideSharedPreferenceFactory create(PreferencesModule module,
      Provider<Context> contextProvider) {
    return new PreferencesModule_ProvideSharedPreferenceFactory(module, contextProvider);
  }

  public static SharedPreferences provideSharedPreference(PreferencesModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideSharedPreference(context));
  }
}
