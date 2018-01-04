package it.marco.test

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class HelloWorldKtTest{

    @Test
    fun `hello should salute whoever I pass in`() {
        assertThat(hello("me")).contains("hello").contains("me")
    }
}