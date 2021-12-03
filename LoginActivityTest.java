package com.rememberdev.tirtaagung.activity;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginActivityTest {
    @Test
    public void cekemailisnotempthy () {
        String email="admin@gmail.com";
        assertEquals(false,email.isEmpty());

    }
    @Test
    public void cekpassword () {
        String password="admin123";
        assertEquals(false,password.isEmpty());

    }
}