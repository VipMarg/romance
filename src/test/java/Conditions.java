import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUl{


    @Test
    public void test(){
        String fruit="kiwi";
        if(fruit.contains("kiwi")){
            System.out.println("We can find our fruit!");
        }

    }
    @Test
    public void test2(){
        String fruit1="orange";
        String fruit2="kiwi";

        if(fruit2.contains("orange")){
            System.out.println("We can find our fruit1!");
        }
        if(fruit1.contains("orange")){
            System.out.println("We can find our fruit2!!!");
        }
        else {
            System.out.println("We can't find fruit");
        }

    }

    @Test
    public void test3(){
      String fruit1= "kiwi";
      String fruit2= "kiwi";

      if (fruit2.contains("kiwi")&& fruit1.contains("kiwi")){
          System.out.println("We can find our fruit1!");
      }
      else {
          Assert.fail("We can't find fruit");
      }

    }

    public void test4(){
        String fruit1="";
        String fruit2="";

        if(fruit2.contains("orange")){
            System.out.println("We can find our fruit 1!");
        }
        if(fruit1.contains("orange")){
            System.out.println("We can find our fruit2!");
        }
        else {
            Assert.fail("We can't find fruit!");
        }
    }
    @Test
    public void test5(){
      String fruit1="kiwi";
      String fruit2="kiwi";

        if(fruit2.contains("kiwi")||fruit1.contains("orange")){
            System.out.println("We can find our fruit1!");
        }
        else {
            Assert.fail("We can't find fruit");
        }
    }
    @Test
    public void test6(){
        boolean requirement=true;
        if(requirement){
            System.out.println("Boolean is true!");
        }
        else {
            Assert.fail("Boolean is false");
        }
    }
    @Test
    public void test7(){
     int number=10;
     int sum;
     if(number==10+5){
         sum=95+100;
     }
     else {
         sum=100-95;
     }
        System.out.println(sum);
    }
    @Test
    public void test8(){
        WebElement checkbox= driver.findElement(Locators.CHECK_BOX_CONFIRMATION);
        if(!checkbox.isSelected()){
            checkbox.click();
            System.out.println("Checkbox is selected!");
        }

    }

    @Test
    public void test9(){

        List<String> crunchifyList1=new ArrayList<>(Arrays.asList("kiwi","orange","melon"));
        String element= crunchifyList1.get(1);
        System.out.println(element);


    }
    @Test
    public void test10(){
        List<String> crunchifyList1=new ArrayList<>(Arrays.asList("kiwi","orange","melon"));
        if(crunchifyList1.contains("orange")){
            System.out.println(crunchifyList1);
        }
    }
    @Test
    public void test11(){
       List<Integer>crunchifyList1= new ArrayList<>(Arrays.asList(5,10,19));
        int sum= crunchifyList1.get(1)+crunchifyList1.get(2);
        System.out.println(sum);
    }

    @Test
    public void test12(){
        List<WebElement>links= driver.findElements(By.xpath("//ul/li"));
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info= links.get(i).getText();
            System.out.println(info);

        }
    }



}
