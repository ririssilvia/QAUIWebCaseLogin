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

WebUI.navigateToUrl('https://www.facebook.com/')

// Mengisi kolom username
WebUI.setText(findTestObject('Object Repository/FB/FBNegatife/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'), 
    '083130066682')

// Mengisi kolom password
WebUI.setEncryptedText(findTestObject('Object Repository/FB/FBNegatife/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    'vfiPXam91ZoRYRWZpLF03g==')

// Menekan tombol Enter untuk login
WebUI.sendKeys(findTestObject('Object Repository/FB/FBNegatife/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    Keys.chord(Keys.ENTER))

// Menunggu elemen "Try another way" hadir dan terlihat
WebUI.waitForElementPresent(findTestObject('FB/FBNegatife/Page_Facebook/a_Try another way'), 30)

WebUI.waitForElementVisible(findTestObject('FB/FBNegatife/Page_Facebook/a_Try another way'), 30)

// Klik elemen "Try another way"
WebUI.click(findTestObject('FB/FBNegatife/Page_Facebook/a_Try another way'))

// Menunggu elemen "Enter Password to Log In" hadir dan terlihat
WebUI.waitForElementPresent(findTestObject('Object Repository/FB/FBNegatife/Page_Forgotten Password  Cant Log In  Facebook/div_Enter Password to Log In'), 
    30)

WebUI.waitForElementVisible(findTestObject('Object Repository/FB/FBNegatife/Page_Forgotten Password  Cant Log In  Facebook/div_Enter Password to Log In'), 
    30)

// Klik elemen "Enter Password to Log In"
WebUI.click(findTestObject('Object Repository/FB/FBNegatife/Page_Forgotten Password  Cant Log In  Facebook/div_Enter Password to Log In'))

// Menunggu elemen "Continue" hadir dan terlihat
WebUI.waitForElementPresent(findTestObject('Object Repository/FB/FBNegatife/Page_Forgotten Password  Cant Log In  Facebook/button_Continue'), 
    30)

WebUI.waitForElementVisible(findTestObject('Object Repository/FB/FBNegatife/Page_Forgotten Password  Cant Log In  Facebook/button_Continue'), 
    30)

// Klik elemen "Continue"
WebUI.click(findTestObject('Object Repository/FB/FBNegatife/Page_Forgotten Password  Cant Log In  Facebook/button_Continue'))

// Menunggu elemen "Not you" hadir dan terlihat
WebUI.waitForElementPresent(findTestObject('Object Repository/FB/FBNegatife/Page_Log in to Facebook/div_Not you__55r1 _1kbt'), 
    30)

WebUI.waitForElementVisible(findTestObject('Object Repository/FB/FBNegatife/Page_Log in to Facebook/div_Not you__55r1 _1kbt'), 
    30)

// Klik elemen "Not you"
WebUI.click(findTestObject('Object Repository/FB/FBNegatife/Page_Log in to Facebook/div_Not you__55r1 _1kbt'))

// Mengisi kolom password di halaman "Log in to Facebook"
WebUI.setEncryptedText(findTestObject('Object Repository/FB/FBNegatife/Page_Log in to Facebook/input_Not you_pass'), 'vfiPXam91ZoRYRWZpLF03g==')

// Menunggu elemen "Log in" hadir dan terlihat
WebUI.waitForElementPresent(findTestObject('Object Repository/FB/FBNegatife/Page_Log in to Facebook/button_Log in'), 30)

WebUI.waitForElementVisible(findTestObject('Object Repository/FB/FBNegatife/Page_Log in to Facebook/button_Log in'), 30)

// Klik elemen "Log in"
WebUI.click(findTestObject('Object Repository/FB/FBNegatife/Page_Log in to Facebook/button_Log in'))

WebUI.closeBrowser()

