package com.hadi.archives.utils

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore(name = "theme_prefs")

object ThemePreferences {
    private val CUSTOM_THEME_KEY = booleanPreferencesKey("custom_theme_enabled")

    fun getThemeState(context: Context): Flow<Boolean> {
        return context.dataStore.data.map { preferences ->
            preferences[CUSTOM_THEME_KEY] ?: false
        }
    }

    suspend fun saveThemeState(context: Context, isEnabled: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[CUSTOM_THEME_KEY] = isEnabled
        }
    }
}
