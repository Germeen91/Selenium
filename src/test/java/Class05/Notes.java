package Class05;

public class Notes {
    /*1- find the radio buttons (Write down the locator in such a way it selects all desired elements)
    *
    * 2- get them in a list of WebElements
    *
    * 3- traverse through them using a loop one by one
    *
    * 4- find your desired one and perform a click operation
    *
    * ///////////////////////////////////////////////////////////////
    DropDowns
    * 1- check first ...>> if the dropDown has a select tag
    * (if yes  >>>> then u can use Select class from selenium to deal with it)
    *
    * 1/find the dropDown  .....>> using locator
    * 2/declare the object of Select class and in the parameter pass the WebElement
    *
    * Select sel = new Select(WebElement dropDown); >>> parameter is the drop down in step 1
    * sel.selectByIndex();  >> start from 0
    * sel.selectByValue();  >> attribute value
    * sel.selectByVisibleText();
    * sel.IsMultiple();
    *
    *
    * sel.deselectByVisibleText();  ......>> to deselect from multiselect   ... >> works only with multi selection dropDown
    * sel.deselectByValue();        ......>> to deselect from multiselect   ... >> works only with multi selection dropDown
    * sel.selectByIndex();*/

}
