package ch.iagentur.unity.testdogsproject.ui.common

import androidx.fragment.app.Fragment
import java.lang.ref.WeakReference

interface ChainHolder {
    val chain: MutableList<WeakReference<Fragment>>
}