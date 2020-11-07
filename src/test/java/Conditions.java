import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUl {


    @Test
    public void test() {
        String fruit = "kiwi";
        if (fruit.contains("kiwi")) {
            System.out.println("We can find our fruit!");
        }

    }

    @Test
    public void test2() {
        String fruit1 = "orange";
        String fruit2 = "kiwi";

        if (fruit2.contains("orange")) {
            System.out.println("We can find our fruit1!");
        }
        if (fruit1.contains("orange")) {
            System.out.println("We can find our fruit2!!!");
        } else {
            System.out.println("We can't find fruit");
        }

    }

    @Test
    public void test3() {
        String fruit1 = "kiwi";
        String fruit2 = "kiwi";

        if (fruit2.contains("kiwi") && fruit1.contains("kiwi")) {
            System.out.println("We can find our fruit1!");
        } else {
            Assert.fail("We can't find fruit");
        }

    }

    @Test
    public void test4() {
        String fruit1 = "";
        String fruit2 = "";

        if (fruit2.contains("orange")) {
            System.out.println("We can find our fruit 1!");
        }
        if (fruit1.contains("orange")) {
            System.out.println("We can find our fruit2!");
        } else {
            Assert.fail("We can't find fruit!");
        }
    }

    @Test
    public void test5() {
        String fruit1 = "kiwi";
        String fruit2 = "kiwi";

        if (fruit2.contains("kiwi") || fruit1.contains("orange")) {
            System.out.println("We can find our fruit1!");
        } else {
            Assert.fail("We can't find fruit");
        }
    }

    @Test
    public void test6() {
        boolean requirement = true;
        if (requirement) {
            System.out.println("Boolean is true!");
        } else {
            Assert.fail("Boolean is false");
        }
    }

    @Test
    public void test7() {
        int number = 10;
        int sum;
        if (number == 10 + 5) {
            sum = 95 + 100;
        } else {
            sum = 100 - 95;
        }
        System.out.println(sum);
    }

    @Test
    public void test8() {
        WebElement checkbox = driver.findElement(Locators.CHECK_BOX_CONFIRMATION);
        if (!checkbox.isSelected()) {
            checkbox.click();
            System.out.println("Checkbox is selected!");
        }

    }

    @Test
    public void test9() {

        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
        String element = crunchifyList1.get(1);
        System.out.println(element);


    }

    @Test
    public void test10() {
        List<String> crunchifyList1 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
        if (crunchifyList1.contains("orange")) {
            System.out.println(crunchifyList1);
        }
    }

    @Test
    public void test11() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        int sum = crunchifyList1.get(1) + crunchifyList1.get(2);
        System.out.println(sum);
    }

    @Test
    public void test12() {
        List<WebElement> links = driver.findElements(By.xpath("//ul/li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);

        }
    }

    @Test
    public void test13() {
        int number1 = 10;
        int number2 = 10;
        int sum;
        if (number1 == number2) {
            sum = 95 + 100;
        } else {
            sum = 100 - 95;
        }
        System.out.println(sum);

    }
    @Test
    public void test14(){
      List<String >crunchifyList1= new ArrayList<>(Arrays.asList("kiwi","orange","melon"));
      String element= crunchifyList1.get(0);
        System.out.println(element);

    }
    @Test
    public void test15(){
      List<String>crunchifyList1=new ArrayList<>(Arrays.asList("kiwi","orange","melon"));
      if(crunchifyList1.contains("orange")){
          System.out.println(crunchifyList1);
      }
    }

    @Test
    public void test16(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello, everybody!");

        }

    }

    @Test
    public void test17(){
     List<WebElement>links=driver.findElements(By.xpath("//button"));
        System.out.println(links.size());
        for (int i = 0; i <links.size(); i++) {
          String info= links.get(i).getText();
            System.out.println(info);
        }

    }
    @Test
    public void test18(){
        List<Integer>crunchifylist1=new ArrayList<>(Arrays.asList(5,10,19));
        for (int i = 0; i <crunchifylist1.size() ; i++) {
            int element =crunchifylist1.get(i);
            System.out.println(element);

        }

    }
    @Test
    public void test19(){
        List<Integer>crunchifylist1=new ArrayList<>(Arrays.asList(5,10,19));
        System.out.println(crunchifylist1.size());
        crunchifylist1.add(10);
        System.out.println(crunchifylist1.size());

        for (int i = 0; i <crunchifylist1.size(); i++) {
            int element=crunchifylist1.get(i);
            System.out.println(element);
        }

    }

    @Test
    public void test20(){
      String phrase= "Melon is inside list";
      List<String >crunchifylist1=new ArrayList<>(Arrays.asList("apple","kiwi",phrase));
      crunchifylist1.add("melon");
        System.out.println(crunchifylist1);

        for (int i = 0; i < crunchifylist1.size(); i++) {
            String element= crunchifylist1.get(i);
            System.out.println(i + "iteration");

            if(element.contains("me")){
                System.out.println(phrase);
            }
            if(element.equals("orange")){
                System.out.println("Orange");
            }
            if(element.contains("i")){
                System.out.println("IIIII");
            }
            else {
                System.out.println("Bad loop");
            }

        }
    }
    @Test
    public void test21(){
        String expectedTitle="Ukrainian women for marriage";
        List<WebElement>links=driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info=links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            if(info.contains("WORK")){
                String actualTitle= driver.findElement(By.xpath("//h1")).getText();
                Assert.assertEquals(expectedTitle,actualTitle);
            }
            driver.get(Data.expectedUrlHowItWorks);
            links= driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));


        }


   }





}