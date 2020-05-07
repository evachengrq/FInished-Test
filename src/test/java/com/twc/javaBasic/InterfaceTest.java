package com.twc.javaBasic;

import com.twc.javaBasic.util.InterfaceExtendsInterfaceWithDefaultMethod;
import com.twc.javaBasic.util.InterfaceExtendsInterfaceWithDefaultMethodImpl;
import com.twc.javaBasic.util.InterfaceWithDefaultMethodImpl;
import com.twc.javaBasic.util.InterfaceWithOverrideDefaultImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterfaceTest {
    // Recommended time used: 20 min

    @Test
    void should_support_default_method() {
        InterfaceWithDefaultMethodImpl instance = new InterfaceWithDefaultMethodImpl();

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  If you find it difficult, please check page 298 of "Core Java Vol 1", section 6.1.5.
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, instance.tellMeTheTruthOfTheUniverse());
    }

    @Test
    void should_choose_override_method() {
        InterfaceWithOverrideDefaultImpl instance = new InterfaceWithOverrideDefaultImpl();

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint:
        //  If you find it difficult, please check page 298 of "Core Java Vol 1", section 6.1.5 and 6.1.6
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, instance.tellMeTheTruthOfTheUniverse());
    }

    @Test
    void should_choose_override_method_continued() {
        InterfaceExtendsInterfaceWithDefaultMethod instance = new InterfaceExtendsInterfaceWithDefaultMethodImpl();

        // TODO:
        //  Please write down your answer directly.
        //
        // Hint
        //  If you find it difficult, please check page 298 of "Core Java Vol 1", section 6.1.5 and 6.1.6
        // <--start
        final String expected = "";
        // --end-->

        assertEquals(expected, instance.tellMeTheTruthOfTheUniverse());
    }
}
