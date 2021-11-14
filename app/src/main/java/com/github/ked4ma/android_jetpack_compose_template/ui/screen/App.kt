package com.github.ked4ma.android_jetpack_compose_template.ui.screen

import androidx.compose.runtime.Composable
import com.github.ked4ma.android_jetpack_compose_template.ui.theme.AndroidjetpackcomposetemplateTheme
import com.google.accompanist.insets.ProvideWindowInsets

@Composable
fun JetpackComposeTemplateApp(content: @Composable () -> Unit) {
    AndroidjetpackcomposetemplateTheme {
        ProvideWindowInsets {
            content()
        }
    }
}