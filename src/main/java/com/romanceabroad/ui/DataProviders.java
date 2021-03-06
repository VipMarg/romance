package com.romanceabroad.ui;

import org.testng.annotations.DataProvider;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataProviders {

    @DataProvider(name = "Registration2")
    public static Object[][] testRegistration2() {
        return new Object[][]{
                {Data.email, Data.nickname,true},
                {Data.email2, Data.nickname,false},
                {Data.email3, Data.nickname,true},
        };
    }
    @DataProvider(name = "Search")
    public static Object[][] testSearchFeature() {
        return new Object[][]{
                {"18", "80","Default"},
                {"18", "19","Name"},
                {"30", "40","Views"},
                {"60", "80","Registration date"},

        };
    }




    @DataProvider(name = "Registration")
    public static Object[][] testRegistration ()throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("Registration.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8]});
        });
        return out.toArray(new Object[out.size()][]);

    }

    @DataProvider(name = "SignIn2")
    public static Object[][] testSignIn2() {
        return new Object[][]{
                {Data.email, Data.password,false},
                {Data.email2, Data.password,false},
                {Data.email3, Data.password,false},

        };
    }
    @DataProvider(name="NewRequirementsForPassword")
    public static Object[][] newRequirementsForPassword(){
        return new Object[][]{
                {"ParisWithLove", true},
                {"Boston1", true},
                {"Boston23", true},
                {"Boston@@", true},
                {"Paris21", true},
                {"LondonNow", true},
                {"Miami##1", false},
                {"Miami25", false},
        };
    }

}
