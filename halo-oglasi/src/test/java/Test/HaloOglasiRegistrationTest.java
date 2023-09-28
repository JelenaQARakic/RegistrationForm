package Test;

import Base.BaseHaloOglasi;
import Page.*;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class HaloOglasiRegistrationTest extends BaseHaloOglasi {

    HomePageHaloOglasi homePageHaloOglasi;
    LogInPage logInPage;
    RegistrationPage registrationPage;
    SuccessfulRegistrationPage successfulRegistrationPage;
    InboxPageMailinator inboxPageMailinator;
    HaloOglasiEmailWindow haloOglasiEmailWindow;
    SuccessfulActivationPageHaloOglasi successfulActivationPageHaloOglasi;
    Random ran = new Random();
    int x = ran.nextInt(999999);
    String ime = "TestIme";
    private WebDriver driver;

    @Before

    public void setUpTest () {

        homePageHaloOglasi = new HomePageHaloOglasi();
        logInPage = new LogInPage();
        registrationPage = new RegistrationPage();
        successfulRegistrationPage = new SuccessfulRegistrationPage();
        haloOglasiEmailWindow = new HaloOglasiEmailWindow();
        successfulActivationPageHaloOglasi = new SuccessfulActivationPageHaloOglasi();
    }


    @Test

    public void haloOglasiSuccessfullRegistrationTest () throws InterruptedException {
        homePageHaloOglasi.clickUreduCookieButton();
        homePageHaloOglasi.clickUlogujSeLink();
        logInPage.clickRegistrujSeLink();
        registrationPage.inputKorisnickoImeField(ime + x);
        registrationPage.inputEmailField("exoduspatronus2020@example.com");
        registrationPage.inputPasswordField("29bastion");
        registrationPage.inputConfirmPassword("29bastion");
        registrationPage.unchekNewsLetterCheckbox();
        registrationPage.checkSaglasnostFiskalniRacuni();
        registrationPage.clickRegistrujMe();
        Thread.sleep(48000);

        String expectedMessage = "Registracija je uspela!\n" +
                "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na" + " " + ": exoduspatronus2020@example.com !";
        String actualMessage = successfulActivationPageHaloOglasi.uspesnaAktivacijaMessageText();

        System.out.println("Očekivana poruka: " + expectedMessage);
        System.out.println("Stvarna poruka: " + actualMessage);

        Assert.assertEquals(expectedMessage, actualMessage);

    }


    }

