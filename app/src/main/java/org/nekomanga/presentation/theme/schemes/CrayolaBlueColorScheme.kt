package org.nekomanga.presentation.theme.schemes

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

internal object CrayolaBlueColorScheme : BaseColorScheme() {
    override val darkScheme =
        darkColorScheme(
            primary = Color(0xFF3080FF),
            onPrimary = Color(0xFFFFFFFF),
            primaryContainer = Color(0xFF185BC7),
            onPrimaryContainer = Color(0xFFFFFFFF),
            inversePrimary = Color(0xFF3080FF),
            secondary = Color(0xFF3080FF),
            onSecondary = Color(0xFFFFFFFF),
            secondaryContainer = Color(0xFF3080FF),
            onSecondaryContainer = Color(0xFFFFFFFF),
            tertiary = Color(0xFF55971C),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFF386412),
            onTertiaryContainer = Color(0xFFE5E1E5),
            background = Color(0xFF16151D),
            onBackground = Color(0xFFE5E1E5),
            surface = Color(0xFF16151D),
            onSurface = Color(0xFFE5E1E5),
            surfaceVariant = Color(0xFF434352),
            onSurfaceVariant = Color(0xFFC2C1D6),
            surfaceTint = Color(0xFF3080FF),
            inverseSurface = Color(0xFF333043),
            inverseOnSurface = Color(0xFFFFFFFF),
            error = Color(0xFFFFB4AB),
            onError = Color(0xFF690005),
            errorContainer = Color(0xFF93000A),
            onErrorContainer = Color(0xFFFFDAD6),
            outline = Color(0xFF8C8D9F),
            outlineVariant = Color(0xFF44464F),
            surfaceContainer = Color(0xFF171C2F),
        )

    override val lightScheme =
        lightColorScheme(
            primary = Color(0xFF0058CA),
            onPrimary = Color(0xFFFFFFFF),
            primaryContainer = Color(0xFFD9E2FF),
            onPrimaryContainer = Color(0xFF001945),
            inversePrimary = Color(0xFFB0C6FF),
            secondary = Color(0xFF0058CA),
            onSecondary = Color(0xFFFFFFFF),
            secondaryContainer = Color(0xFFD9E2FF),
            onSecondaryContainer = Color(0xFF001945),
            tertiary = Color(0xFF006E1B),
            onTertiary = Color(0xFFFFFFFF),
            tertiaryContainer = Color(0xFF95F990),
            onTertiaryContainer = Color(0xFF002203),
            background = Color(0xFFFEFBFF),
            onBackground = Color(0xFF1B1B1F),
            surface = Color(0xFFFEFBFF),
            onSurface = Color(0xFF1B1B1F),
            surfaceVariant = Color(0xFFE1E2EC),
            onSurfaceVariant = Color(0xFF44464F),
            surfaceTint = Color(0xFF0058CA),
            inverseSurface = Color(0xFF303034),
            inverseOnSurface = Color(0xFFF2F0F4),
            error = Color(0xFFBA1A1A),
            onError = Color(0xFFFFFFFF),
            errorContainer = Color(0xFFFFDAD6),
            onErrorContainer = Color(0xFF410002),
            outline = Color(0xFF757780),
            outlineVariant = Color(0xFFC5C6D0),
            surfaceContainer = Color(0xFFEBEDF9),
        )
}
