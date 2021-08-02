package utilities;

import org.openqa.selenium.By;

public class ObjectMap {
    public enum locator{id, name, classname, tagname, linktext, partiallinktext, xpath, cssselector;}
    public static By getLocator(String objPropDesc) throws Exception{
        String locatorType;
        String locatorValue;
        boolean hasLocatorType = objPropDesc.contains("|");
        if (hasLocatorType){
            String[] parts = objPropDesc.split("\\|");
            locatorType = parts[0];
            locatorValue = parts[1];
        }else{
            locatorType = "xpath";
            locatorValue = objPropDesc;
        }
        String finalLocator = locatorType.toLowerCase();
        switch (locator.valueOf(finalLocator)){
            case id:				return By.id(locatorValue);
            case name:				return By.name(locatorValue);
            case classname:			return By.className(locatorValue);
            case tagname:			return By.tagName(locatorValue);
            case linktext:			return By.linkText(locatorValue);
            case partiallinktext:	return By.partialLinkText(locatorValue);
            case cssselector:		return By.cssSelector(locatorValue);
            case xpath:				return By.xpath(locatorValue);
            default:				throw new Exception("Unknown locator Type '" + locatorType + "' for Object '" + objPropDesc + "'");
        }
    }
}
