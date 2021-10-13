package dataProviders;

import com.github.javafaker.Faker;
import model.AccountBuilder;
import org.testng.annotations.DataProvider;

public class RegistrationPageDataProvider {

    public Faker faker = new Faker();

    @DataProvider
    public Object[][] registrationNewUser() {
        return new Object[][]{
                {
                        new AccountBuilder()
                                .withGender("1")
                                .withFirstCustomerName("Dima")
                                .withLastCustomerName("Hulak")
                                .withEmail(faker.internet().emailAddress())
                                .withPassword("qwerty312")
                                .withBirthDay("10")
                                .withBirthdayMonth("12")
                                .withBirthdayYear("1990")
                                .withFirstName("Dima")
                                .withLastName("Hulak")
                                .withCompany("Google")
                                .withAddress1("street New York, 12")
                                .withAddress2("street New York, 14")
                                .withCity("New York")
                                .withState("New York")
                                .withPostalCode("12345")
                                .withCountry("United States")
                                .withPhoneMobile("1234567890")
                                .withAliasAddress("Hello!")
                                .build()
                }
        };
    }
}
