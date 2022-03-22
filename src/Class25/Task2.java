package Class25;
/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
*/

interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    public void openBrowser() {System.out.println("Opening Chrome browser");}
    public void closeBrowser() {System.out.println("Close Chrome browser");}
    public void maximizeWindow() {System.out.println("Maximize Chrome Window");}
    public void findElement() {System.out.println("Finding elements in Chrome browser");}
}
class FirefoxDriver implements WebDriver {
    public void openBrowser() {System.out.println("Opening FirefoxDriver browser");}
    public void closeBrowser() {System.out.println("Opening FirefoxDriver browser");}
    public void maximizeWindow() {System.out.println("Opening FirefoxDriver browser");}
    public void findElement() {System.out.println("Opening FirefoxDriver browser");}
}
class WebDriverTester1{
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.openBrowser();
        webDriver.openBrowser();
        webDriver.findElement();
        webDriver.maximizeWindow();
        webDriver.closeBrowser();

        WebDriver[] webDrivers = {new ChromeDriver(),new FirefoxDriver()};
        for (WebDriver w:webDrivers
        ) {
            w.openBrowser();
            w.openBrowser();
            w.findElement();
            w.maximizeWindow();
            w.closeBrowser();
        }
    }

}