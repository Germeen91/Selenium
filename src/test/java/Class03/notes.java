package Class03;

public class notes {

        /*
      1/ Xpath
       absolute Xpath
       start from the root node but so long we are not using more and any changing in structure will effect(dynamic)*/

    //absolute-one by one from top to bottom until it finds what we need
    //relative -goes straight to what we need

    // {relative Xpath}
    //tagname[@attribute='value'] >> syntax
    // >> attribute    >> //tagname[@attribute='value']
    // >> text         >>  // tag name[text() = ' Value of text']
    // >> partial value {partial attribute / partial text}
    // >> starts-with
    // >> indexing   ... when we have same attribute same value (capsule the xpath)>>[index]
    // >> operators  ... when we have same attribute same value >> //tagname[@attribute='value' and @attribute='value']

    //input[@id="id"hello" and @name="yellow"]
    //get me the tag name "input" which has attribute id whose value is "hello" and it also has

    //By.tagName  >> to find the element by tag name
    //trying to get multiple elements>> list of WebElements lists=driver.findElementsByy.tagname("input")

}//for(WebElement abc:list){

//send text to all input tags found
//  abc.sendkeys("hello)}
