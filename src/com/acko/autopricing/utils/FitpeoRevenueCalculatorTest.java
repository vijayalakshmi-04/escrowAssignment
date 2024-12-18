
	package com.acko.autopricing.utils;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
//	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.time.Duration;

	public class FitpeoRevenueCalculatorTest {
	    public static void main(String[] args) {
	        // Set up ChromeDriver
//	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to FitPeo Revenue Calculator
	            driver.get("https://fitpeo.com/revenue-calculator");
	            driver.manage().window().maximize();

	            // Part 1: Drag the Slider to Target Value (820)
	            WebElement sliderThumb = driver.findElement(By.cssSelector("input[type='range']"));
	            WebElement sliderTrack = driver.findElement(By.cssSelector(".MuiSlider-rail"));

	            // Scroll slider into view
	            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sliderThumb);

	            // Get slider attributes
	            int minValue = Integer.parseInt(sliderThumb.getAttribute("min"));
	            int maxValue = Integer.parseInt(sliderThumb.getAttribute("max"));
	            int currentValue = Integer.parseInt(sliderThumb.getAttribute("value"));

	            System.out.println("Min Value: " + minValue);
	            System.out.println("Max Value: " + maxValue);
	            System.out.println("Current Value: " + currentValue);

	            // Target value for slider
	            int targetSliderValue = 820;

	            // Calculate the target percentage and xOffset
	            double targetPercent = (double) (targetSliderValue - minValue) / (maxValue - minValue);
	            int sliderTrackWidth = sliderTrack.getSize().getWidth();
	            int xOffset = (int) (sliderTrackWidth * targetPercent);

	            // Apply a refined correction factor
	            xOffset = (int) (xOffset * 0.77); // Adjust correction factor if necessary

	            System.out.println("Slider Track Width: " + sliderTrackWidth);
	            System.out.println("Target Percent: " + targetPercent);
	            System.out.println("Refined xOffset: " + xOffset);

	            // Perform drag and drop
	            Actions actions = new Actions(driver);
	            actions.dragAndDropBy(sliderThumb, xOffset, 0).perform();

	            // Verify the updated value
	            Thread.sleep(1000); // Wait for the UI to update
	            int updatedSliderValue = Integer.parseInt(sliderThumb.getAttribute("value"));
	            String ariaValueNow = sliderThumb.getAttribute("aria-valuenow");

	            System.out.println("Updated Value: " + updatedSliderValue);
	            System.out.println("aria-valuenow: " + ariaValueNow);

	            if (updatedSliderValue == targetSliderValue) {
	                System.out.println("Test passed! Slider value updated correctly to " + targetSliderValue);
	            } else {
	                System.out.println("Test failed! Expected " + targetSliderValue + " but got " + updatedSliderValue);
	            }

	            Thread.sleep(1000); // Wait for the UI to update

	            // Locate the number input
	            WebElement textField = driver.findElement(By.id(":R57alklff9da:"));

	            // Clear the number input and set the new value
	            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript(
	                    "arguments[0].value = '';", textField); // Clear value
	            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript(
	                    "arguments[0].value = arguments[1];", textField, "560"); // Set the value to 560

	            // Trigger the necessary events to sync the slider and number input
	            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript(
	                    "const eventInput = new Event('input', { bubbles: true });" +
	                            "const eventChange = new Event('change', { bubbles: true });" +
	                            "arguments[0].dispatchEvent(eventInput);" +
	                            "arguments[0].dispatchEvent(eventChange);", textField);

	            // Wait for the slider and text field to update
	            Thread.sleep(1000);

	            // Verify the updated values
	            updatedSliderValue = Integer.parseInt(driver.findElement(By.cssSelector("input[type='range']")).getAttribute("value"));
	            int updatedTextFieldValue = Integer.parseInt(textField.getAttribute("value"));

	            System.out.println("Updated Text Field Value: " + updatedTextFieldValue);
	            System.out.println("Updated Slider Value: " + updatedSliderValue);

	            // Check if the values match the expected value
	            if (updatedSliderValue == 560 && updatedTextFieldValue == 560) {
	                System.out.println("Test passed! Both text field and slider updated correctly.");
	            } else {
	                System.out.println("Test failed! Slider value: " + updatedSliderValue + ", Text field value: " + updatedTextFieldValue);
	            }

	            // Part 2: Select CPT checkboxes and verify sum
	            // Explicit Wait to ensure the checkboxes are visible
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Increase timeout to 20 seconds

	            // Define the checkboxes and expected sum
	            String[] cptCodes = {"CPT-99091", "CPT-99453", "CPT-99454", "CPT-99474"};
	            int expectedSum = 110700; // Replace with the expected sum value

	            // Select all checkboxes
	            for (String code : cptCodes) {
	                WebElement cptElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'" + code + "')]")));
	                WebElement checkbox = cptElement.findElement(By.xpath("ancestor::div[contains(@class, 'MuiBox-root')]/descendant::input[@type='checkbox']"));

	                if (!checkbox.isSelected()) {
	                    ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
	                }

	                // Wait for a specific time to ensure the page updates accordingly
	                Thread.sleep(2000); // Adjust based on the page load time
	            }

	            // Final verification of the total sum
	            WebElement finalTotalReimbursementElement = driver.findElement(By.xpath("//div[contains(@class, 'MuiBox-root css-m1khva')]/p[contains(@class, 'MuiTypography-root MuiTypography-body2 inter css-1msk7rm')]/following-sibling::p[contains(@class, 'MuiTypography-root MuiTypography-body1 inter css-12bch19')]"));
	            String finalTotalReimbursementText = finalTotalReimbursementElement.getText().replaceAll("[^\\d]", "").trim();
	            int finalTotalReimbursementValue = Integer.parseInt(finalTotalReimbursementText);

	            if (finalTotalReimbursementValue == expectedSum) {
	                System.out.println("Test passed! Final total recurring reimbursement is " + expectedSum + ".");
	            } else {
	                System.out.println("Test failed! Expected " + expectedSum + " but got: " + finalTotalReimbursementValue);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	    }
	}

}
