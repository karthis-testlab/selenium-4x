### Implicity Wait Change

On Before, Selenium 4.0.0 version implicitlyWait method have two arguments first one is long data type and second one is TimeUnit enum type

``` driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); ```

After Selenium 4.0.0 release version selenium type did one major change on the implicitlyWait methodthey deprecated the mplicitlyWait method 
have two arguments and implement the on new method implicitlyWait with one argument as Duration class type	 

``` driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); ```
