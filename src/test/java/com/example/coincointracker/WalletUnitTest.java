package com.example.coincointracker;

import com.example.coincointracker.Model.Wallet;
import com.example.coincointracker.controller.AuthActivity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WalletUnitTest {
    @Test
    public void createWallet() throws Exception {
        Wallet wallet = new Wallet(42);

        assertEquals(42, wallet.getBalance(), 0.001);
    }

    @Test
    public void depositMoney() throws Exception {
        Wallet wallet = new Wallet(0);

        wallet.deposit(10);

        assertEquals(10, wallet.getBalance(), 0.001);
    }

    @Test
    public void withdrawMoney() throws Exception {
        Wallet wallet = new Wallet(20);

        wallet.withdraw(10);

        assertEquals(10, wallet.getBalance(), 0.001);
    }

    @Test
    public void testWalletContent() throws Exception {
        AuthActivity authActivity = mock(AuthActivity.class);
        when(authActivity.getUserToken()).thenReturn("FakeToken");

        String token = authActivity.getUserToken();

        // Test token
    }
}