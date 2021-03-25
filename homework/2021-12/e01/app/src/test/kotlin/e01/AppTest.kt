/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package e01

import kotlin.test.Test
import kotlin.test.*

class AppTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
    @Test fun testSearch() {
        var array = arrayOf(1, 3, 2)
        assertEquals(search(array, 3), 1, "index should be 1")
        assertNull(search(array, 5), "should return null")
    }
}