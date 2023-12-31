import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.adidas.com.vn/vi')

WebUI.click(findTestObject('Object Repository/Search objects/Page_adidas Vietnam Online - Shop Sports  O_289a28/span_Thanh thiu nin (8-16)_gl-icon__wrapper'))

WebUI.setText(findTestObject('Object Repository/Search objects/Page_adidas Vietnam Online - Shop Sports  O_289a28/input_Ting Vit__input_1rlri_35'), 
    'ultraboost')

WebUI.sendKeys(findTestObject('Object Repository/Search objects/Page_adidas Vietnam Online - Shop Sports  O_289a28/input_Ting Vit__input_1rlri_35'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Search objects/Page_adidas Ultraboost  adidas Official Shop/button_TIP TC_account-portal-close'))

WebUI.closeBrowser()

