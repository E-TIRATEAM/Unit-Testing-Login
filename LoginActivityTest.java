package com.rememberdev.tirtaagung.activity;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginActivityTest {
    @Test
    public void cekemailisnotempty () {
        String email="admin@gmail.com";
        assertEquals(false,email.isEmpty());

    }
    @Test
    public void cekemailisempty () {
        String email="";
        assertEquals(true,email.isEmpty());

    }
    @Test
    public void cekpasswordisnotempty () {
        String password="admin123";
        assertEquals(false,password.isEmpty());

    }
    @Test
    public void cekpasswordisempty () {
        String password="";
        assertEquals(true,password.isEmpty());

}